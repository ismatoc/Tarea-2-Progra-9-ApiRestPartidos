package com.partidos.apirest.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partidos.apirest.Entity.Partido;
import com.partidos.apirest.dao.PartidoDao;

 

@Service
public class PartidoServiceImpl implements PartidoService {

	@Autowired
	private PartidoDao partidoDAO;
	
	@Override
	public List<Partido> findAll() {
		List<Partido> listPartidos= partidoDAO.findAll();
		return listPartidos;
	}

	@Override
	public Partido findById(int id) {
		Partido partido = partidoDAO.findById(id);
		return partido;
	}

	@Override
	public void save(Partido partido) {
		partidoDAO.save(partido);

	}

	@Override
	public void deleteById(int id) {
		partidoDAO.delete(id);
	}

}