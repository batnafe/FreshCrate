package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class CreateOrderDTO {
    @NotNull(message = "Customer Id cannot be null")
    private Integer customerId;
    @NotEmpty(message = "List of Order Items can not be empty")
    private List<OrderItemDTO> orderItems;

    public CreateOrderDTO(Integer customerId, List<OrderItemDTO> orderItems) {
        setCustomerId(customerId);
        setOrderItems(orderItems);
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
