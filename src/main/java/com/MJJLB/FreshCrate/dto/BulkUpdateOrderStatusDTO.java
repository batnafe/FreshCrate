package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class BulkUpdateOrderStatusDTO {
    @NotEmpty(message = "List of orderIDs cannot be empty")
    private List<Integer> orderIds;
    @NotNull(message = "Status ID cannot be null")
    private int statusId;

    public BulkUpdateOrderStatusDTO(List<Integer> orderIds, int statusId) {
        setOrderIds(orderIds);
        setStatusId(statusId);
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
