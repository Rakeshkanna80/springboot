package com.xworkz.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.demo.dto.Alien;

@Repository
public interface AlienDAO extends CrudRepository<Alien, Integer> {

}
