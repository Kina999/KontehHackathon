package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Faculty;
import com.example.demo.repository.FacultyRepository;
import com.example.demo.service.interfaces.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService{

	@Autowired 
	private FacultyRepository facultyRepository;
	
	@Override
	public List<Faculty> getAll() {
		return facultyRepository.findAll();
	}

}
