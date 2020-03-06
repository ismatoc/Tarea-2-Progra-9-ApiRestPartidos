package  com.partidos.apirest.service;

import java.util.List;

import com.partidos.apirest.Entity.Partido;

public interface PartidoService {
	
	public List<Partido> findAll();
	
	public Partido findById(int id);
	
	public void save (Partido partido);
	
	public void deleteById (int id);

}
