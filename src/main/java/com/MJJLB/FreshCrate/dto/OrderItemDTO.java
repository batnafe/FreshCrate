package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class OrderItemDTO {
    @NotBlank(message = "Order item ID cannot be blank")
    private int orderItemId;
    @NotBlank(message = "Order item name cannot be blank")
    @Size(max = 30, message = "Order item name must be less than 30 characters")
    private String name;
    @NotNull(message = "Item quantity cannot be null")
    private int quantity;

    public OrderItemDTO(int orderItemId, String name, int quantity) {
        setOrderItemId(orderItemId);
        setName(name);
        setQuantity(quantity);
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
