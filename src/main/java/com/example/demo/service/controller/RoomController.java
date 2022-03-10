package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.interfaces.RoomService;

@RestController
@RequestMapping(value = "/rooms")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(roomService.getAll(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "faculty")
	public ResponseEntity<?> getFacultyRooms(@RequestParam String faculty) {
		return new ResponseEntity<>(roomService.getFacultyRooms(faculty), HttpStatus.OK);
	}
}
