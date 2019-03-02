package com.hikari.crud.dto;

/**
 * Created by hikari on 16/11/2018.
 */
public class ColumnDto {
    private String column;

    private  String comment;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ColumnDto(String column) {
        this.column = column;
    }

    public ColumnDto() {
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }
}
