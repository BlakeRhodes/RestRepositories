package com.example.rest;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Supplier {
    @Id
    private String id;
    private String name;
}
