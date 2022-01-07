package com.disney.model;

import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class PeliculaSerie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPeliculaSerie")
	private Integer idPeliculaSerie;
	
	@Column
	private Blob imagenPeliculaSerie;
	
	@Column
	private String tituloPeliculaSerie;
	
	@Column
	private Integer calificacionPeliculaSerie;
	
	@Column
	private Date fechaPeliculaSerie;
	
	@ManyToOne
    @JoinColumn(name="idGenero", insertable= false, updatable = false)
    private Genero genero;
    
	@Column (name ="idGenero", nullable = false)
    private Integer idGenero;

	@Column (name ="idPersonaje", nullable = false)
    private Integer idPersonaje;
	
	@ManyToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "idPeliculaSerie",
            joinColumns = @JoinColumn(name= "idPeliculaSerie"),
            inverseJoinColumns = @JoinColumn(name = "idPersonaje"))
    
	private List<Personaje> personajes= new ArrayList<>();

	public Integer getIdPeliculaSerie() {
		return idPeliculaSerie;
	}

	public void setIdPeliculaSerie(Integer idPeliculaSerie) {
		this.idPeliculaSerie = idPeliculaSerie;
	}

	public Blob getImagenPeliculaSerie() {
		return imagenPeliculaSerie;
	}

	public void setImagenPeliculaSerie(Blob imagenPeliculaSerie) {
		this.imagenPeliculaSerie = imagenPeliculaSerie;
	}

	public String getTituloPeliculaSerie() {
		return tituloPeliculaSerie;
	}

	public void setTituloPeliculaSerie(String tituloPeliculaSerie) {
		this.tituloPeliculaSerie = tituloPeliculaSerie;
	}

	public Integer getCalificacionPeliculaSerie() {
		return calificacionPeliculaSerie;
	}

	public void setCalificacionPeliculaSerie(Integer calificacionPeliculaSerie) {
		this.calificacionPeliculaSerie = calificacionPeliculaSerie;
	}

	public Date getFechaPeliculaSerie() {
		return fechaPeliculaSerie;
	}

	public void setFechaPeliculaSerie(Date fechaPeliculaSerie) {
		this.fechaPeliculaSerie = fechaPeliculaSerie;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public List<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}  
    
}
