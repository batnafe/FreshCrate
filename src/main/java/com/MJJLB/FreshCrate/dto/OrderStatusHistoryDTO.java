package com.MJJLB.FreshCrate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class OrderStatusHistoryDTO {
    @NotBlank(message = "Order status cannot be blank")
    @Size(max = 30, message = "Order status must be less than 30 characters")
    private String status;
    @NotNull(message = "Change date cannot be null")
    private LocalDateTime changeDate;

    public OrderStatusHistoryDTO(String status, LocalDateTime changeDate) {
        setStatus(status);
        setChangeDate(changeDate);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
}
