package com.disney.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.disney.model.Personaje;

public interface PersonajesDAO extends JpaRepository<Personaje, Integer> {

}
