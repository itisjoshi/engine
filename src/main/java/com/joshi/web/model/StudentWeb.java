package com.joshi.web.model;

public class StudentWeb {

	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	private TeamWeb teamWeb;

	public TeamWeb getTeamWeb() {
		return teamWeb;
	}
	public void setTeamWeb(TeamWeb team) {
		this.teamWeb = team;
	}

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
