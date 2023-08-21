package com.fullstackextra.fullstackextra.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackextra.fullstackextra.Repository.Repositories;
import com.fullstackextra.fullstackextra.entities.Problem;

@Service
public class serviceImpl implements service{
	
	@Autowired
	private Repositories repo;

	@Override
	public List<Problem> getAllProblems() {
		// TODO Auto-generated method stub
		
		List<Problem> list = this.repo.findAll();
	
		return list;
	}

	@Override
	public Problem getProblem(int id) {
		// TODO Auto-generated method stub
		Problem problem = this.repo.getOne(id);
		return problem;
	}


	@Override
	public void addProblem(Problem problem) {
		// TODO Auto-generated method stub
		this.repo.save(problem);
		
	}

	@Override
	public void updateProblem(int id) {
		// TODO Auto-generated method stub
		Problem problem = this.repo.getOne(id);
		this.repo.save(problem);
		
	}
	
	
	
	@Override
	public void deleteProblem(int id) {
		// TODO Auto-generated method stub
		
		this.repo.deleteById(id);
		
	}

}
