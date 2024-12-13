package com.example.orderservice.vo;

import lombok.Data;

@Data
public class RequestOrder {
    private String ProductId;
    private Integer qty;
    private Integer unitPrice;
}
