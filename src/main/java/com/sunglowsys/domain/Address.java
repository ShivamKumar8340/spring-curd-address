package com.sunglowsys.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;

    @Column(nullable = false)
    private String country;
    private String zipCode;

    @Column(nullable = false)
    private Long Hotel_id;

    public Address() {}

    public Address(String address_line1, String address_line2, String city, String state, String country, String zipCode, Long hotel_id) {
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        Hotel_id = hotel_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getHotel_id() {
        return Hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        Hotel_id = hotel_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(address_line1, address.address_line1) && Objects.equals(address_line2, address.address_line2) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(country, address.country) && Objects.equals(zipCode, address.zipCode) && Objects.equals(Hotel_id, address.Hotel_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address_line1, address_line2, city, state, country, zipCode, Hotel_id);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address_line1='" + address_line1 + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", Hotel_id=" + Hotel_id +
                '}';
    }
}
