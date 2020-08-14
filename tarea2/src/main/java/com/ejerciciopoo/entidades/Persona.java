package com.ejerciciopoo.entidades;





import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Persona {
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	
	@OneToMany(targetEntity = Ranking.class)
	private List<Ranking> ranking= new ArrayList<>();
	
	public Persona(String nombre) {
	}
	
	



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public List<Ranking> getRanking() {
		return ranking;
	}





	public void setRanking(List<Ranking> ranking) {
		this.ranking = ranking;
	}



	



}
