package com.disney.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.disney.model.PeliculaSerie;

public interface PeliculaSerieDAO extends JpaRepository<PeliculaSerie, Integer> {

}