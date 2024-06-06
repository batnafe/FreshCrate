package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public class CustomerOrderHistoryDTO {
    @NotNull(message = "Order ID cannot be null")
    private int orderId;
    @NotNull(message = "Order date cannot be null")
    @PastOrPresent(message = "Order date cannot be in the future")
    private LocalDateTime orderDate;
    @NotNull(message = "Delivery date cannot be null")
    @FutureOrPresent(message = "Delivery date cannot be in the past")
    private LocalDateTime deliveryDate;
    @NotBlank(message = "Order status cannot be blank")
    @Size(max = 30, message = "Order status must be less than 30 characters")
    private String status;

    public CustomerOrderHistoryDTO(int orderId,
                                   LocalDateTime orderDate,
                                   LocalDateTime deliveryDate,
                                   String status) {
        setOrderId(orderId);
        setOrderDate(orderDate);
        setDeliveryDate(deliveryDate);
        setStatus(status);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
