package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Desk;
import com.example.demo.repository.DeskRepository;
import com.example.demo.service.interfaces.DeskService;

@Service
public class DeskServiceImpl implements DeskService{
	
	@Autowired 
	private DeskRepository deskRepository;

	@Override
	public List<Desk> getAll() {
		return deskRepository.findAll();
	}
	
	
}
