package com.joshi.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.joshi.core.model.Team;
public interface TeamRepository extends CrudRepository<Team,Long> {
	@SuppressWarnings("unchecked")
	public Team save(Team team);
	public void delete(Team team);
	public  List<Team> findAll();
	public Team findById(Long id);
}
