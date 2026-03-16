package com.example.Aop.services.impl;

import com.example.Aop.services.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Override
    public String orderPackage(Long orderId) {
        try{
            log.info("processing the order...");
            Thread.sleep(1000);
        }catch (Exception e){
            log.error("error occured while processing the order", e);
        }
        return "Order has been processed successfully, orderId:"+orderId;
    }

    @Override
    public String trackpackage(Long orderId) {
        return "";
    }
}
