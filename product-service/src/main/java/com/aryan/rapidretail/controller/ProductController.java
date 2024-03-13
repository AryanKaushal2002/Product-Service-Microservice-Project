package com.aryan.rapidretail.controller;

import com.aryan.rapidretail.dto.ProductRequest;
import com.aryan.rapidretail.dto.ProductResponse;
import com.aryan.rapidretail.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // to specify that this class is a controller
@RequestMapping("/api/product") // api call to create products and get all products
@RequiredArgsConstructor // to create a constructor with all the required fields at runtime
public class ProductController {

    private final ProductService productService; // to create a reference to the ProductService class


    @PostMapping() // to specify that this method is called when a post request is made to /api/product/create
    @ResponseStatus(HttpStatus.CREATED) // to specify that the response status is 201
    public void createProduct(@RequestBody ProductRequest productRequest ) {
        // create a product
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
