package com.example.demo.service.interfaces;

import java.util.List;

import com.example.demo.model.Room;

public interface RoomService {
	
	public List<Room> getAll();
	
	public void addDeskToRoom(String deskId, String roomId);

	public List<Room> getFacultyRooms(String faculty);

}
