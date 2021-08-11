package com.spring.jpa.datarepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.Alien;

@Repository
public interface Alienrepo extends JpaRepository<Alien, Integer>{
	
}
