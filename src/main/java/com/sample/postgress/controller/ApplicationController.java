package com.sample.postgress.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.entity.Absence;
import com.sample.postgress.entity.Employee;
import com.sample.postgress.entity.EmployeeProjectPeriod;
import com.sample.postgress.entity.Project;
import com.sample.postgress.entity.Skill;
import com.sample.postgress.entity.userPacman;
import com.sample.postgress.service.AbsenceService;
import com.sample.postgress.service.EmployeeProjectPeriodService;
import com.sample.postgress.service.EmployeeService;
import com.sample.postgress.service.ProjectService;
import com.sample.postgress.service.SkillService;
import com.sample.postgress.service.userPacmanService;


@RestController
@RequestMapping("/postgressApp")
@CrossOrigin(origins = "http://localhost:4200") 

public class ApplicationController {
	
	@Resource 
	EmployeeService EmployeeService;
	@Resource
	userPacmanService userPacmanService;
	@Resource
	ProjectService projectService;
	@Resource
	SkillService skillService;
	@Resource 
	AbsenceService absenceService;
	@Resource
	EmployeeProjectPeriodService employeeProjectPeriodService;
	
	
	@GetMapping(value = "/EmployeeList")
	public List<Employee> getEmployee() {
		return EmployeeService.findAll();
		
	}
	
	
	@GetMapping(value = "/EmployeeProjectList")
	public List<EmployeeProjectPeriod> getEmployeeProjectPeriod() {
	return employeeProjectPeriodService.findAll();
		
	}
	
	@PostMapping(value = "/createEmployee")
	public void createEmployee(@RequestBody Employee emp) {
		EmployeeService.insertEmployee(emp);
	
	}
	@PutMapping(value = "/updateEmployee")
	public void updateEmployee(@RequestBody Employee emp) {
		EmployeeService.updateEmployee(emp);
	
	}
	
	@DeleteMapping(value = "/deleteEmployeeById")
	public void deleteEmployee(@RequestBody Employee emp) {
		EmployeeService.deleteEmployee(emp);
	
	}
	@GetMapping(value = "/userPacmanList")
	public List<userPacman> getuserPacman() {
		return userPacmanService.findAll();
		
	}
	
	@PostMapping(value = "/createuserPacman")
	public void createuserPacman(@RequestBody userPacman us) {
		userPacmanService.insertuserPacman(us);
	
	}
	@PutMapping(value = "/updateuserPacman")
	public void updateuserPacman(@RequestBody userPacman us) {
		userPacmanService.updateuserPacman(us);
	
	}
	
	@DeleteMapping(value = "/deleteuserPacmanById")
	public void deleteuserPacman(@RequestBody userPacman us) {
		userPacmanService.deleteuserPacman(us);
	
	}
	
	@GetMapping(value = "/projectList")
	public List<Project> getProject() {
		return projectService.findAll();
		
	}
	
	@PostMapping(value = "/createProject")
	public void createProject(@RequestBody Project pro) {
		projectService.insertProject(pro);
	
	}
	@PutMapping(value = "/updateProject")
	public void updateProject(@RequestBody Project pro) {
		projectService.updateProject(pro);
	
	}
	
	@DeleteMapping(value = "/deleteProjectById")
	public void deleteProject(@RequestBody Project pro) {
		projectService.deleteProject(pro);
	
	}
	
	@GetMapping(value = "/skillList")
	public List<Skill> getSkill() {
		return skillService.findAll();
		
	}
	
	@PostMapping(value = "/createSkill")
	public void createSkill(@RequestBody Skill ski) {
		skillService.insertSkill(ski);
	
	}
	@PutMapping(value = "/updateSkill")
	public void updateSkill(@RequestBody Skill ski) {
		skillService.updateSkill(ski);
	
	}
	
	@DeleteMapping(value = "/deleteSkillById")
	public void deleteSkill(@RequestBody Skill ski) {
		skillService.deleteSkill(ski);
	
	}
	
	@GetMapping(value = "/absenceList")
	public List<Absence> getAbsence() {
		return absenceService.findAll();
		
	}
	
	@PostMapping(value = "/createAbsence")
	public void createAbsence(@RequestBody Absence abs) {
		absenceService.insertAbsence(abs);
	
	}
	@PutMapping(value = "/updateAbsence")
	public void updateAbsence(@RequestBody Absence abs) {
		absenceService.updateAbsence(abs);
	
	}
	
	@DeleteMapping(value = "/deleteAbsenceById")
	public void deleteAbsence(@RequestBody Absence abs) {
		absenceService.deleteAbsence(abs);
	
	}
	
	
	
	
}
