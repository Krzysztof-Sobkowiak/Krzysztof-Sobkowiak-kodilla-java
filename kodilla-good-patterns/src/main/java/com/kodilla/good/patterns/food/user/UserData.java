package com.kodilla.good.patterns.food.user;

public class UserData {

    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String city;
    private String cityCode;

    public UserData(String street, String houseNumber, String apartmentNumber, String city, String cityCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.cityCode = cityCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCityCode() {
        return cityCode;
    }

}
