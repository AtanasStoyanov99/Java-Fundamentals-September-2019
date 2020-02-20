package com.company;

public class CompanyET extends Company {
    private String ownerName;
    private double startCapital;
    private double actualCapital;

    public String getOwnerName() {
        return ownerName;
    }

    public  void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getStartCapital() {
        return startCapital;
    }

    public void setStartCapital(double startCapital) {
        this.startCapital = startCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public double calculateProfit(){
        return actualCapital - startCapital;
    }

    public static void main(String[] args) {

    }
}
