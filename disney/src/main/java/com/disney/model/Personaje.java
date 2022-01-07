package com.disney.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import java.sql.Blob;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersonaje")
	private Integer idPersonaje;
	
	@Column
	private String nombrePersonaje;
	
	@Column
	private Integer edadPersonaje;
	
	@Column
	private Float pesoPersonaje;
	
	@Column 
	private String historiaPersonaje;
			
	@Column
	private Blob imagenPersonaje;
	
	@ManyToMany(mappedBy = "idPersonaje", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<PeliculaSerie> PersonajePeliculaSerie= new HashSet<>();
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (getClass()!= obj.getClass())
            return false;
        final Personaje other=(Personaje) obj;
        return other.idPersonaje==this.idPersonaje;
        }
    
	public Integer getIdPersonaje() {
		return idPersonaje;
	}
	public void setIdPersonaje(Integer idPersonaje) {
		this.idPersonaje = idPersonaje;
	}
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}
	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}
	public Integer getEdadPersonaje() {
		return edadPersonaje;
	}
	public void setEdadPersonaje(Integer edadPersonaje) {
		this.edadPersonaje = edadPersonaje;
	}
	public Float getPesoPersonaje() {
		return pesoPersonaje;
	}
	public void setPesoPersonaje(Float pesoPersonaje) {
		this.pesoPersonaje = pesoPersonaje;
	}
	public String getHistoriaPersonaje() {
		return historiaPersonaje;
	}
	public void setHistoriaPersonaje(String historiaPersonaje) {
		this.historiaPersonaje = historiaPersonaje;
	}
	public Blob getImagenPersonaje() {
		return imagenPersonaje;
	}
	public void setImagenPersonaje(Blob imagenPersonaje) {
		this.imagenPersonaje = imagenPersonaje;
	}
	public Set<PeliculaSerie> getPersonajePeliculaSerie() {
		return PersonajePeliculaSerie;
	}
	public void setPersonajePeliculaSerie(Set<PeliculaSerie> personajePeliculaSerie) {
		PersonajePeliculaSerie = personajePeliculaSerie;
	}
    
}