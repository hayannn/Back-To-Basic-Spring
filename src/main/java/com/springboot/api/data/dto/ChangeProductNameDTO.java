package com.springboot.api.data.dto;

public class ChangeProductNameDTO {
    private Long number;
    private String name;

    public ChangeProductNameDTO(Long number, String name){
        this.number = number;
        this.name = name;
    }

    public ChangeProductNameDTO(){
    }

    public Long getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }

    public void setNumber(Long number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }
}
