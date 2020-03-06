package com.partidos.apirest.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name="partido")
@Table(name="partido")
public class Partido {
/*PK == Primary Key*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_partido")
	private int id_partido;
	
	@Column(name="equipo1")
	private String equipo1;
	
	@Column(name="equipo2")
	private String equipo2;
	
	@Column(name="jugadores")
	private int jugadores;
	
	@Column(name="tarjetas_amarillas")
	private int tarjetas_amarillas;
	
	@Column(name="goles")
	private int goles;
	
	
	/*parametros nombrados*/
	public Partido() {}
	public Partido(int id_partido, String equipo1, String equipo2, int jugadores, int tarjetas_amarillas, int goles) {
		this.id_partido = id_partido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.jugadores = jugadores;
		this.tarjetas_amarillas = tarjetas_amarillas;
		this.goles = goles;
	}
	/*GET*/
	
	public int getId_partido() {
		return this.id_partido;
	}
	
	public String getEquipo1() {
		return this.equipo1;
	}
	
	public String getEquipo2() {
		return this.equipo2;
	}

	public int getJugadores() {
		return this.jugadores;
	}
	
	public int getTarjetas_amarillas() {
		return this.tarjetas_amarillas;
	}
	
	public int getGoles() {
		return this.goles;
	}
	/*SET*/
	
	public void setId_partido(int id_partido) {
		this.id_partido = id_partido;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
	public void setTarjetas_amarillas(int tarjetas_amarillas) {
		this.tarjetas_amarillas = tarjetas_amarillas;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
}
