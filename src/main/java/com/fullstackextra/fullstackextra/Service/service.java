package com.fullstackextra.fullstackextra.Service;

import java.util.List;

import com.fullstackextra.fullstackextra.entities.Problem;

public interface service {
	
	public List<Problem> getAllProblems();
	
	public Problem getProblem(int id);
	
	public void addProblem(Problem problem);
	
	public void updateProblem(int id); 
	
	public void deleteProblem(int id); 
}
