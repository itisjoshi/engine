package com.joshi.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joshi.core.model.Team;
import com.joshi.core.repository.TeamRepository;

@Service("TeamService")
@Repository
@Transactional(value = "sharedTransactionManager")
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public Team save(Team team) {
		// TODO Auto-generated method stub
		return teamRepository.save(team);
	}

	@Override
	public void delete(Team team) {
		// TODO Auto-generated method stub
		teamRepository.save(team);
	}

	@Override
	public List<Team> findAll() {
		// TODO Auto-generated method stub
		return teamRepository.findAll();
	}

	@Override
	public Team findById(Long id) {
		// TODO Auto-generated method stub
		return teamRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		teamRepository.delete(id);
	}
}
