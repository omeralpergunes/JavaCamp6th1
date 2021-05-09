package Kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.hrms.business.abstracts.WorkerService;
import Kodlama.io.hrms.dataAccess.abstracts.WorkerDao;
import Kodlama.io.hrms.entities.concretes.Worker;

@Service
public class WorkerManager implements WorkerService {

	private WorkerDao workerDao;
	
	@Autowired
	public WorkerManager(WorkerDao workerDao) {
		super();
		this.workerDao = workerDao;
	}

	@Override
	public List<Worker> getAll() {
		return this.workerDao.findAll();
	}

	
}
