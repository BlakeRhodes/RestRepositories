package com.example.rest;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRespository extends CrudRepository<Supplier, String> {
    Supplier findByName(String frank);
}

