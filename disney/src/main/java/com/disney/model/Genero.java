package com.disney.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Column;

@Entity
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGenero")
	private Integer idGenero;
	
	@Column
	private String nombreGenero;
	
	@Column
	private Integer edadPersonaje;
	
	@Column
	private Blob imagenGenero;
	
	@OneToMany(mappedBy = "idGenero")
    List<PeliculaSerie> GeneroPeliculaSerie;

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public Integer getEdadPersonaje() {
		return edadPersonaje;
	}

	public void setEdadPersonaje(Integer edadPersonaje) {
		this.edadPersonaje = edadPersonaje;
	}

	public Blob getImagenGenero() {
		return imagenGenero;
	}

	public void setImagenGenero(Blob imagenGenero) {
		this.imagenGenero = imagenGenero;
	}

	public List<PeliculaSerie> getGeneroPeliculaSerie() {
		return GeneroPeliculaSerie;
	}

	public void setGeneroPeliculaSerie(List<PeliculaSerie> generoPeliculaSerie) {
		GeneroPeliculaSerie = generoPeliculaSerie;
	}
}