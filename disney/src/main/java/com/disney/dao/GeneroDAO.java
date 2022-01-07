package com.disney.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.disney.model.Genero;

public interface GeneroDAO extends JpaRepository<Genero, Integer> {

}