package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class OrderSummaryReportDTO {
    @NotBlank(message = "First name cannot be blank")
    @Size(max = 30, message = "First name must be less than 30 characters")
    private String firstName;
    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 30, message = "Last name must be less than 30 characters")
    private String lastName;
    @NotNull(message = "Order ID cannot be null")
    private int orderId;
    @NotNull(message = "Total items ordered cannot be null")
    private int totalItemsOrdered;

    public OrderSummaryReportDTO(String firstName, String lastName, int orderId, int totalItemsOrdered) {
        setFirstName(firstName);
        setLastName(lastName);
        setOrderId(orderId);
        setTotalItemsOrdered(totalItemsOrdered);
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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTotalItemsOrdered() {
        return totalItemsOrdered;
    }

    public void setTotalItemsOrdered(int totalItemsOrdered) {
        this.totalItemsOrdered = totalItemsOrdered;
    }
}
