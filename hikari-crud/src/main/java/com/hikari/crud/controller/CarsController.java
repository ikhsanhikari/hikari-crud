package com.hikari.crud.controller;

import java.util.List;

import javax.validation.Valid;

import com.hikari.crud.core.BaseController;
import com.hikari.crud.model.Guru;
import com.hikari.crud.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.hikari.crud.exception.ResourceNotFoundException;
import com.hikari.crud.model.Cars;
import com.hikari.crud.repository.CarsRepository;

@EnableJpaRepositories("com.hikari.crud.repository")
@EntityScan("com.hikari.crud.model")


@RequestMapping("/cars")
@RestController
public class CarsController {
	
	@Autowired
	CarsRepository carsRepository;

	@RequestMapping(value="/cars/create", method=RequestMethod.POST)
	public Cars createCars(@RequestBody Cars cars) {
		return carsRepository.save(cars);
	}

	@RequestMapping(value="/cars/findAll", method=RequestMethod.GET)
	public List<Cars> findAllCars() {
		return Lists.newArrayList(carsRepository.findAll());
	}

	@DeleteMapping("/cars/delete/{vin}")
	public ResponseEntity<?> deleteCars(@PathVariable(value="vin") String vin){
		Cars cars= carsRepository.findById(vin)
                .orElseThrow(() -> new ResourceNotFoundException("Cars", "vin", vin));
		carsRepository.delete(cars);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/cars/update/{vin}")
	public Cars updateCars(@PathVariable(value="vin") String vin, @Valid @RequestBody Cars carsDetail) {
		Cars cars = carsRepository.findById(vin)
				.orElseThrow(()->new ResourceNotFoundException("cars", "vin", vin));
		cars.setBrand(carsDetail.getBrand());
		cars.setColor(carsDetail.getColor());
		cars.setType(carsDetail.getType());
		cars.setYear(carsDetail.getYear());
		cars.setPrices(carsDetail.getPrices());
		return carsRepository.save(cars);
	}

}
