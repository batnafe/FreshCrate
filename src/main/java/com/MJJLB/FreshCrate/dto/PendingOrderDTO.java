package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PendingOrderDTO {
    @NotNull(message = "Order ID cannot be null")
    private Integer orderId;
    @NotBlank(message = "First name cannot be blank")
    @Size(max = 30, message = "First name must be less than 30 characters")
    private String firstName;
    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 30, message = "Last name must be less than 30 characters")
    private String lastName;
    @NotNull(message = "Days pending cannot be null")
    private int daysPending;

    public PendingOrderDTO(Integer orderId, String firstName, String lastName, int daysPending) {
        setOrderId(orderId);
        setFirstName(firstName);
        setLastName(lastName);
        setDaysPending(daysPending);
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDaysPending() {
        return daysPending;
    }

    public void setDaysPending(int daysPending) {
        this.daysPending = daysPending;
    }
}

