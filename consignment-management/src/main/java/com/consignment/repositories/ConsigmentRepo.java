package com.consignment.repositories;

import com.consignment.entities.Consigment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsigmentRepo extends JpaRepository<Consigment,Integer> {

}
