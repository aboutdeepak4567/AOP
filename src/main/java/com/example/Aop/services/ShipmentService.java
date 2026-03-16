package com.example.Aop.services;

public interface ShipmentService {
    public String orderPackage(Long orderId);

    public String trackpackage(Long orderId);
}
