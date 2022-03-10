package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, String>{
	
	@Query(value = "select r.id as id, r.name as name from room r, faculty_rooms rd, faculty f\r\n"
			+ "where r.id = rd.rooms_id and faculty_id = f.id and f.name = ?1", nativeQuery = true)
	List<Room> getFacultyRooms(String facultyName);
	
	@Modifying
	@Transactional
	@Query(value = "insert into room_desks(room_id, desks_id) values (?1, ?2)", nativeQuery = true)
	void addDeskToRoom(String roomId, String deskId);
}
