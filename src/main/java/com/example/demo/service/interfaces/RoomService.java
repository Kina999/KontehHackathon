package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.model.Room;

public interface RoomService {
	public List<Room> getAll();
	public List<Room> getFacultyRooms(String faculty);
}
