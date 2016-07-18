package com.joshi.web.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joshi.core.model.Student;
import com.joshi.core.model.Team;
import com.joshi.core.service.StudentService;
import com.joshi.core.service.TeamService;
import com.joshi.web.model.StudentWeb;
import com.joshi.web.model.TeamWeb;

@Component
public class StudentTeamService {

	@Autowired
	TeamService teamService;
	
	@Autowired
	StudentService studentService;
	
	public List<TeamWeb> getTeams() {
		// TODO Auto-generated method stub
		List<Team> teams = teamService.findAll();
		Iterator<Team> teamIterator = teams.iterator();
		List<TeamWeb> teamWebs = new ArrayList<TeamWeb>();
		while(teamIterator.hasNext()) {
			Team team = teamIterator.next();
			teamWebs.add(teamToWeb(team));
		}
		return teamWebs;
	}

	public void saveStudents(List<StudentWeb> studentWebs) {
		// TODO Auto-generated method stub
		Iterator<StudentWeb> studentWebIterator = studentWebs.iterator();
		List<Student> students = new ArrayList<Student>();
		while(studentWebIterator.hasNext()) {
			Student student = new Student();
			StudentWeb studentWeb = studentWebIterator.next();
			student.setId(studentWeb.getId());
			student.setName(studentWeb.getName());
			student.setTeam(null);
			if(studentWeb.getTeamWeb() != null) {
				TeamWeb teamWeb = studentWeb.getTeamWeb();
				Team team = teamService.findById(teamWeb.getId());
				student.setTeam(team);				
			}
			students.add(student);
		}
		studentService.save(students);
	}

	public TeamWeb teamToWeb(Team team) {
		TeamWeb teamWeb = new TeamWeb();
		teamWeb.setId(team.getId());
		teamWeb.setName(team.getName());		
		return teamWeb;
	}
	public List<StudentWeb> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = studentService.findAll();
		Iterator<Student> studentIterator = students.iterator();
		List<StudentWeb> studentWebs = new ArrayList<StudentWeb>();
		while(studentIterator.hasNext()) {
			Student student = studentIterator.next();
			StudentWeb studentWeb = new StudentWeb();
			studentWeb.setId(student.getId());
			studentWeb.setName(student.getName());
			if(student.getTeam() != null) {
				TeamWeb teamWeb = teamToWeb(student.getTeam());
				studentWeb.setTeamWeb(teamWeb);				
			}
			studentWebs.add(studentWeb);
		}
		return studentWebs;
	}

}
