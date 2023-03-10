package com.fullstackextra.fullstackextra.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Problem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String problemName;
	private String link ; 
//	private Boolean check ; 
	private String difficulty;
	public Problem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Problem(int id, String problemName, String link, String difficulty) {
		super();
		this.id = id;
		this.problemName = problemName;
		this.link = link;

		this.difficulty = difficulty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProblemName() {
		return problemName;
	}
	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	@Override
	public String toString() {
		return "Problem [id=" + id + ", problemName=" + problemName + ", link=" + link 
				+ ", difficulty=" + difficulty + "]";
	} 
	
	
	
	
	
}
