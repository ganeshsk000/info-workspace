package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Train;
@Repository
public interface TrainRepository extends CrudRepository<Train, Integer> {

}
