package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Desk;
import com.example.demo.repository.DeskRepository;
import com.example.demo.service.interfaces.DeskService;
import com.example.demo.service.interfaces.RoomService;

@Service
public class DeskServiceImpl implements DeskService{
	
	@Autowired
	private RoomService roomService;
	
	@Autowired 
	private DeskRepository deskRepository;

	@Override
	public List<Desk> getAll() {
		return deskRepository.findAll();
	}

	@Override
	public void deleteDeskById(String id) {
		deskRepository.deleteRoomDesk(id);
		deskRepository.deleteById(id);
	}

	@Override
	public List<Desk> getRoomDesks(String room) {
		return deskRepository.getRoomDesks(room);
	}

	@Override
	public void addDesk(String roomId) {
		Desk desk = new Desk(generateDeskId(), getNewDeskNumber(roomId));
		deskRepository.save(desk);
		roomService.addDeskToRoom(desk.getId(), roomId);
	}

	public Integer getNewDeskNumber(String roomId) {
		
		List<Desk> roomDesks = deskRepository.getRoomDesks(roomId);
		
		Integer newTableNumber = 0;
		boolean exists = false;
		boolean deskNumberFound = false;
		
		while(!deskNumberFound) {
			for(Desk desk : roomDesks) {
				if(desk.getOrder() == newTableNumber) {
					exists = true;
					break;
				}
			}
			if(exists) {
				newTableNumber++;
				exists = false;
			}else {deskNumberFound = true;}
		}
		return newTableNumber;
	}
	
	public String generateDeskId() {
		
		int stringLength = 24;
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
		
		StringBuilder sb = new StringBuilder(stringLength);
		
		for (int i = 0; i < stringLength; i++) {
			int index = (int)(AlphaNumericString.length() * Math.random());			
			sb.append(AlphaNumericString.charAt(index));
		}
		
		return sb.toString();
	}
	
}
