package com.example.thanhcao.currencyconverter.Model;

public class Country {
    private String name;
    private double rate;
    private String code;

    public Country(String countryName, String code, double rate) {
        this.name = countryName;
        this.code = code;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
