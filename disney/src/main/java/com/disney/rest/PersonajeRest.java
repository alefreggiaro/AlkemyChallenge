package com.disney.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.dao.PersonajesDAO;
import com.disney.model.Personaje;

@RestController
@RequestMapping("characters")
public class PersonajeRest {
	
	@Autowired
	private PersonajesDAO PersonajeDAO;

	@PostMapping("/characters/save")
	public void guardarPersonaje(@RequestBody Personaje personaje) {
		PersonajeDAO.save(personaje);
	}
	
	@GetMapping("/characters/see")
	public List<Personaje> lista(){
		return PersonajeDAO.findAll();
	}
	
	@DeleteMapping("/characters/delete")
	public void delete(Integer id) {
		PersonajeDAO.deleteById(id);
	}
	
	@PutMapping("/characters/modify")
	public void modify(@RequestBody Personaje personaje) {
		PersonajeDAO.save(personaje);
	}

}
