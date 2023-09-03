package com.example.comercioElectronicoNeoris.infrastructure.controller;

import com.example.comercioElectronicoNeoris.infrastructure.model.PriceRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @GetMapping
    public String getPrices(@RequestBody PriceRequest priceRequest) {
        return "funciono";
    }
}
