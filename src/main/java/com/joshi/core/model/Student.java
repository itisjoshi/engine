package com.joshi.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@Table(name = "STUDENT")
@JsonInclude(Include.NON_EMPTY)
public class Student extends AbstractEntity {

	private static final long serialVersionUID = 4812924695317850534L;
	
	public Student(){
		
	}

	@Column(name = "NAME", length = 250)
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	@ManyToOne(optional = true)
	@JoinColumn(name = "TEAMID")
	@JsonBackReference(value = "team-student")
	private Team team;

	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

}
