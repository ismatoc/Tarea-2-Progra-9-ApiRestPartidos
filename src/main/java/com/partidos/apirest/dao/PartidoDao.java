package com.partidos.apirest.dao;
import java.util.List;

import com.partidos.apirest.Entity.Partido;

public interface PartidoDao {
	public List<Partido> findAll();
	
	public Partido findById(int id);
	
	public void save (Partido partido);
	
	public void delete (int id);
}
