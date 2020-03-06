package com.partidos.apirest.dao;
import org.springframework.transaction.annotation.Transactional;

import com.partidos.apirest.Entity.Partido;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public class PartidoDaoImpl implements PartidoDao {
	
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Partido> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Partido> selectQuery = currentSession.createQuery("from partido", Partido.class);
		List<Partido> partidos = selectQuery.getResultList();
		return partidos;
	}

	@Override
	public Partido findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Partido partido = currentSession.get(Partido.class, id);
		return partido;
	}

	@Override
	public void save(Partido partido) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(partido);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Partido> deleteQuery = currentSession.createQuery("delete from partido where id=:idPartido");
		deleteQuery.setParameter("idPartido", id);
		deleteQuery.executeUpdate();
	}

}
