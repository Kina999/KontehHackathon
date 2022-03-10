package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.model.Desk;

public interface DeskService{
	public List<Desk> getAll();
	public void deleteDeskById(String id);
	public List<Desk> getRoomDesks(String room);
}
