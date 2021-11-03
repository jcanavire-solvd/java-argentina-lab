package com.company.personnel;

public abstract class Employee {
   private Integer id;
   private String name;
   private String surName;


   public Employee (Integer id, String name, String surName) {

       this.id = id;
       this.name = name;
       this.surName = surName;
   }

//Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
//Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

}
