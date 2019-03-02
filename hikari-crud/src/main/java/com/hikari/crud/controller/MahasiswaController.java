package com.hikari.crud.controller;

import java.util.List;

import javax.validation.Valid;

import com.hikari.crud.core.BaseController;
import com.hikari.crud.repository.TestRepositoryIface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hikari.crud.exception.ResourceNotFoundException;

import com.hikari.crud.model.Mahasiswa;
import com.google.common.collect.Lists;
import com.hikari.crud.repository.MahasiswaJPARepository;
import com.hikari.crud.repository.MahasiswaRepository;


//@EnableJpaRepositories("com.hikari.crud.repository")
//@EntityScan("com.hikari.crud.model")


@RequestMapping("/mahasiswa")
@RestController
public class MahasiswaController extends BaseController<Mahasiswa,String>{
//
//	@Autowired
//	MahasiswaRepository mahasiswaRepository;
//
//	@Autowired
//	MahasiswaJPARepository mahasiswaJpaRepository;
//
//	@RequestMapping(value="/mahasiswa",method=RequestMethod.GET)
//	@ResponseBody
//	public String getHikari() {
//		return "hikari";
//	}
//
//	@RequestMapping(value="/mahasiswa/create", method=RequestMethod.POST)
//	public Mahasiswa createMahasiswa(@RequestBody Mahasiswa mahasiswa) {
//		return mahasiswaRepository.save(mahasiswa);
//	}
//
//	@RequestMapping(value="/mahasiswa/findAll", method=RequestMethod.GET)
//	public List<Mahasiswa> findAllMahasiswa() {
//		return Lists.newArrayList(mahasiswaRepository.findAll());
//	}
//
//	@RequestMapping(value="/mahasiswa/findSome/{cari}", method=RequestMethod.GET)
//	public List<Mahasiswa> findSomeMahasiswa(@PathVariable(value="cari") String cari) {
//		return Lists.newArrayList(mahasiswaJpaRepository.getNamaMahasiswa(cari));
//	}
//
//	@GetMapping("/mahasiswa/findBynim/{nim}")
//    public Mahasiswa getMahasiswaById(@PathVariable(value = "nim") String nim) {
//        return mahasiswaRepository.findById(nim)
//                .orElseThrow(() -> new ResourceNotFoundException("Mahasiswa", "id", nim));
//    }
//
//	@DeleteMapping("/mahasiswa/delete/{nim}")
//	public ResponseEntity<?> deleteMahasiswa(@PathVariable(value="nim") String nim){
//		Mahasiswa mahasiswa = mahasiswaRepository.findById(nim)
//                .orElseThrow(() -> new ResourceNotFoundException("Mahasiswa", "nim", nim));
//		mahasiswaRepository.delete(mahasiswa);
//		return ResponseEntity.ok().build();
//	}
//
//	@PutMapping("/mahasiswa/update/{nim}")
//	public Mahasiswa updateMahasiswa(@PathVariable(value="nim") String nim, @Valid @RequestBody Mahasiswa mahasiswaDetail) {
//		Mahasiswa mahasiswa = mahasiswaRepository.findById(nim)
//				.orElseThrow(()->new ResourceNotFoundException("mahasiswa", "nim", nim));
//		mahasiswa.setNama(mahasiswaDetail.getNama());
//		mahasiswa.setAlamat(mahasiswaDetail.getAlamat());
//		mahasiswa.setEmail(mahasiswaDetail.getEmail());
//		mahasiswa.setNo_telp(mahasiswaDetail.getNo_telp());
//		return mahasiswaRepository.save(mahasiswa);
//	}


}
