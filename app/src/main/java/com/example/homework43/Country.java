package com.example.homework43;

public class Country {
    private String countryName;
    private String capitalName;
    private int countryFlag;

    public Country(String countryName, String capitalName, int countryFlag) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.countryFlag = countryFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(int countryFlag) {
        this.countryFlag = countryFlag;
    }


}

