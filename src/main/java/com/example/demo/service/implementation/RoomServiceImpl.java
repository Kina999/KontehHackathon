package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Room;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.interfaces.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public List<Room> getAll() {
		return roomRepository.findAll();
	}

	@Override
	public List<Room> getFacultyRooms(String faculty) {
		return roomRepository.getFacultyRooms(faculty);
	}

	
}
