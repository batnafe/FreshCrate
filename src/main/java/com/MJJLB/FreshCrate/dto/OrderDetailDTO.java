package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public class OrderDetailDTO {
    @NotBlank(message = "First name cannot be blank")
    @Size(max = 30, message = "First name must be less than 30 characters")
    private String customerFirstName;
    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 30, message = "Last name must be less than 30 characters")
    private String customerLastName;
    @NotNull(message = "Order ID cannot be null")
    private Integer orderId;
    @NotBlank(message = "Order status cannot be blank")
    @Size(max = 30, message = "Order status must be less than 30 characters")
    private String status;
    @NotNull(message = "Order date cannot be null")
    @PastOrPresent(message = "Order date cannot be in the future")
    private LocalDateTime orderDate;
    @NotNull(message = "Delivery date cannot be null")
    @FutureOrPresent(message = "Delivery date cannot be in the past")
    private LocalDateTime deliveryDate;

    public OrderDetailDTO(String customerFirstName,
                          String customerLastName,
                          Integer orderId,
                          String status,
                          LocalDateTime orderDate,
                          LocalDateTime deliveryDate) {
        setCustomerFirstName(customerFirstName);
        setCustomerLastName(customerLastName);
        setOrderId(orderId);
        setStatus(status);
        setOrderDate(orderDate);
        setDeliveryDate(deliveryDate);
    }
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
