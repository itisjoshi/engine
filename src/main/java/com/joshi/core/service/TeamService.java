package com.joshi.core.service;

import java.util.List;

import com.joshi.core.model.Team;

public interface TeamService {
	public Team save(Team team);
	public void delete(Team team);
	public List<Team> findAll();
	public Team findById(Long id);
	public void delete(Long id);
}
