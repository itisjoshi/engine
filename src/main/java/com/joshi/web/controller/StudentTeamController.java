package com.joshi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.joshi.web.model.StudentWeb;
import com.joshi.web.model.TeamWeb;
import com.joshi.web.service.StudentTeamService;

@RestController
@RequestMapping("/team")
public class StudentTeamController {

	@Autowired
	private StudentTeamService studentTeamService;
		
	@RequestMapping(value = "/getteams", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<TeamWeb> getTeams() {
		return studentTeamService.getTeams();
	}
	
	@RequestMapping(value = "/updatestudents", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody void saveStudents(@RequestBody List<StudentWeb> studentWebs) {
		studentTeamService.saveStudents(studentWebs);
	}
		
	@RequestMapping(value = "/getallstudents", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<StudentWeb> getAllStudents() {
		return studentTeamService.getAllStudents();
	}

}
