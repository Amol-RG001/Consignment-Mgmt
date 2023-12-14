package com.consignment.controllers;

import com.consignment.entities.Consigment;
import com.consignment.repositories.ConsigmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ConsignmentController {
    @Autowired
    ConsigmentRepo consigmentRepo;
    // POST -
    @PostMapping("/post")
    public Consigment saveConsign(@RequestBody Consigment con){
        return  consigmentRepo.save(con);
    }
    // PUT  -

    // DELETE -
    @DeleteMapping("/delete/{id}")
    public String deleteConsignment(@PathVariable Integer id){
        consigmentRepo.deleteById(id);
        return "Consignment deleted successfully with id : "+id;
    }
    // GET  -
    @GetMapping("/get")
    public List<Consigment> getAllConsignment(){
        return (List<Consigment>)consigmentRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public  Consigment getSingleConsignment(@PathVariable Integer id){

        return consigmentRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Consignment not found with id : "+id));
    }

}
