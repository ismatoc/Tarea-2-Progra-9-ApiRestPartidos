package com.partidos.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.partidos.apirest.Entity.Partido;
import com.partidos.apirest.service.PartidoService;

@RestController
@RequestMapping("/campeonato") 

public class PartidoRestController {

	@Autowired
	private PartidoService partidoService;

	@GetMapping("/partidos")
	public List<Partido> findAll(){
		
		return partidoService.findAll();
		
	}
	
	@GetMapping("/partidos/{partidoId}")
	public Partido getPartido(@PathVariable int partidoId) {
	Partido partido = partidoService.findById(partidoId);
	if (partido == null) {
	throw new ResponseStatusException(
	HttpStatus.NOT_FOUND, "No Existe el usuario");
	}
	return partido;
	}
	
	@PostMapping("/partidos")
	public Partido addUser(@RequestBody Partido partido) {
	partido.setId_partido(0);
	partidoService.save(partido);
	return partido;
	}
	
	@PutMapping("/partidos/{partidoId}")
	public Partido updatePartido(@RequestBody Partido partido, @PathVariable int partidoId) {
	partido.setId_partido(partidoId);
	partidoService.save(partido);
	return partido;
	}
	
	@DeleteMapping("/partidos/{partidoId}")
	  void deleteUser(@PathVariable int partidoId) {
		partidoService.deleteById(partidoId);
	  }
	
	
	
}