package com.company;

public class Company {

    private String name;
    private String dateOfCreate;
    private String bulstat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        }
        else {
            System.out.println("Incorrect length of bulstat!");
        }
    }

    public static void main(String[] args) {

    }
}

