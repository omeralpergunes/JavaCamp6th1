package Kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.hrms.business.abstracts.WorkerService;
import Kodlama.io.hrms.entities.concretes.Worker;

@RestController
@RequestMapping("/api/workers/")
public class WorkersController {

	
	private WorkerService workerService;
	
	@Autowired
	public WorkersController(WorkerService workerService) {
		super();
		this.workerService = workerService;
	}


	@GetMapping("/getall")
	public List<Worker> getAll() {
	return this.workerService.getAll();
	    
	
}}
