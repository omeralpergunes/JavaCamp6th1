package Kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.hrms.entities.concretes.Worker;

public interface WorkerDao extends JpaRepository<Worker, Integer>{

	
}
