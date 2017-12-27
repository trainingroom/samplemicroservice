package com.learn.samplemicroservice.controller;

import com.learn.samplemicroservice.repository.DataRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class Controller {

    private DataRepo dataRepo;

    @GetMapping("/products/{vendorname}")
    public List<String> getProducts(@PathVariable String vendorname){
        dataRepo.getAllProducts(vendorname);
    }
}
