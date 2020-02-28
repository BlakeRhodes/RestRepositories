package com.example.rest;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication implements ApplicationRunner {

    private SupplierRespository supplierRepository;

    public RestApplication(SupplierRespository supplierRepository) {this.supplierRepository = supplierRepository;}

    public static void main(String[] args) {

        SpringApplication.run(
            RestApplication.class,
            args
        );

    }

    @Override
    public void run(ApplicationArguments args) {
        if(supplierRepository.findByName("frank") == null) {
            Supplier frank = new Supplier();
            frank.setName("frank");
            supplierRepository.save(frank);

            Supplier frances = new Supplier();
            frances.setName("frances");
            supplierRepository.save(frances);

            Supplier grace = new Supplier();
            grace.setName("grace");
            supplierRepository.save(grace);

            Supplier justice = new Supplier();
            justice.setName("justice");
            supplierRepository.save(justice);
        }
    }
}
