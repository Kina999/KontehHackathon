package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.interfaces.DeskService;

@RestController
@RequestMapping(value = "/desks")
public class DeskController {
	
	@Autowired
	private DeskService deskService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(deskService.getAll(), HttpStatus.OK);
	}
	 
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteUser(@PathVariable String id)  
	{  
		deskService.deleteDeskById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "room")
	public ResponseEntity<?> getRoomDesks(@RequestParam String room) {
		return new ResponseEntity<>(deskService.getRoomDesks(room), HttpStatus.OK);
	}
}
