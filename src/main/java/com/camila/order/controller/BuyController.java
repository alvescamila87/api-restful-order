package com.camila.order.controller;

import com.camila.order.model.Buy;
import com.camila.order.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buys")
public class BuyController {

    @Autowired
    public BuyRepository buyRepository;

    @GetMapping
    public List<Buy> search() {
        return buyRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Buy include(@RequestBody Buy buy) {
        return buyRepository.save(buy);
    }
}
