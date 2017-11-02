package com.yfain.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    Product products[] = new Product[6];

    ProductController(){
        products[0] = new Product(0,"First product", 59.99, 4.3,
                "This is a short description of the First Product",
                "For what you pay this is a steal.",
                new String[]{"electronics", "hardware"});

        products[1] = new Product(1,"Second product", 64.99, 3.5,
                "This is a short description of the Second Product",
                "For what you pay this is a steal.",
                new String[]{"books"});

        products[2] = new Product(2,"Third product", 74.99, 4.2,
                "This is a short description of the Third Product",
                "For what you pay this is a steal.",
                new String[]{"electronics"});
        products[3] = new Product(3,"Fourth product", 84.99, 3.9,
                "This is a short description of the Fourth Product",
                "For what you pay this is a steal.",
                new String[]{"hardware"});
        products[4] = new Product(4,"Fifth product", 94.99, 5,
                "This is a short description of the Fifth Product",
                "For what you pay this is a steal.",
                new String[]{"electronics", "hardware"});
        products[5] = new Product(5,"Sixth product", 54.99, 4.6,
                "This is a short description of the Sixth Product",
                "For what you pay this is a steal.",
                new String[]{"books"});
    }

    @RequestMapping(value="products/{id}",
            method = RequestMethod.GET,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public Product getProductById( @PathVariable("id") String productId){

        int prodId = Integer.parseInt(productId);
        
        for (Product prd: products){
            if (prd.id == prodId) {
                return prd;
            }
        }
        
        return null;
    }
    
    @RequestMapping(value="products",
                    method = RequestMethod.GET,
                    produces= MediaType.APPLICATION_JSON_VALUE)
    public Product[] getProducts(){

        return products;
    }
}