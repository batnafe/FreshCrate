package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerAddressDTO {
    private Integer id;
    @NotBlank(message = "Street cannot be blank")
    @Size(max = 100, message = "Street name must be less than 100 characters")
    private String street;
    @NotBlank(message = "City cannot be blank")
    @Size(max = 30, message = "City name must be less than 30 characters")
    private String city;
    @NotBlank(message = "Zip Code cannot be blank")
    @Pattern(regexp = "^[0-9]{5}$", message = "Invalid Zip Code format")
    private String zipCode;
    @NotBlank(message = "State ID cannot be blank")
    @Size(min = 2, max = 2, message = "State ID must be exactly 2 characters")
    private String stateID;
    @NotNull(message = "Customer ID cannot be null")
    private Integer customerId;

    public CustomerAddressDTO(Integer id, String street, String city, String zipCode, String stateID, Integer customerId) {
        setId(id);
        setStreet(street);
        setCity(city);
        setZipCode(zipCode);
        setStateID(stateID);
        setCustomerId(customerId);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
