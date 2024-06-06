package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateOrderItemDTO {
    @NotNull(message = "Order Id cannot be null")
    private Integer orderId;
    @NotBlank(message = "Order item name cannot be blank")
    @Size(max = 30, message = "Order item name must be less than 30 characters")
    private String orderName;
    @NotNull(message = "Item quantity cannot be null")
    private Integer orderQuantity;

    public UpdateOrderItemDTO(Integer orderId, String orderName, Integer orderQuantity) {
        setOrderId(orderId);
        setOrderName(orderName);
        setOrderQuantity(orderQuantity);
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}
