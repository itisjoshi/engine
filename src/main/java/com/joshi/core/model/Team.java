package com.joshi.core.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@Table(name = "TEAM")
@JsonInclude(Include.NON_EMPTY)
public class Team extends AbstractEntity {

	private static final long serialVersionUID = -3671120285525953630L;
	
	public Team(){
		
	}
	
	@Column(name = "NAME", length = 250)
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	@OneToMany(mappedBy = "team")
	private Set<Student> students;

	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}