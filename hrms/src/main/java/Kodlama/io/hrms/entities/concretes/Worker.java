package Kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="workers")
public class Worker {

	@Id
	@GeneratedValue
	@Column(name="Worker_id")
	private int Worker_id;
	
	@Column(name="Workerid")
	private String Workerid;
	
	
	public Worker(int worker_id, String workerid) {
		super();
		Worker_id = worker_id;
		Workerid = workerid;
	}
	public int getWorker_id() {
		return Worker_id;
	}
	public void setWorker_id(int worker_id) {
		Worker_id = worker_id;
	}
	public String getWorkerid() {
		return Workerid;
	}
	public void setWorkerid(String workerid) {
		Workerid = workerid;
	}
	
}
