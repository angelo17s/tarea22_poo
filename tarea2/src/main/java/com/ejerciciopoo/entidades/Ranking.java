package com.ejerciciopoo.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ranking {
	@Id
	@GeneratedValue
	private int id;
	private String ranking;
	@ManyToOne
	@JoinColumn(name="persona_id",referencedColumnName="id")
	private Persona persona;
	@ManyToOne
	@JoinColumn(name="Skil_id",referencedColumnName="id")
	private Skill skill;

	

	public Ranking() {
	}
	

	
	public Ranking(String ranking, Persona persona, Skill skill) {
		super();
		this.ranking = ranking;
		this.persona = persona;
		this.skill = skill;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	
	
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Skill getSkill() {
		return skill;
	}


	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	

}