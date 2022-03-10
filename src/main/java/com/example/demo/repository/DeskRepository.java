package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Desk;

@Repository
public interface DeskRepository extends JpaRepository<Desk, String>{
	
	@Modifying
	@Transactional
	@Query(value = "delete from room_desks where desks_id = ?1", nativeQuery = true)
	void deleteRoomDesk(String deskId);
	
	@Query(value = "select d.id as id, d.table_number as table_number from desk d, room_desks rd\r\n"
			+ "where d.id = rd.desks_id and rd.room_id = ?1", nativeQuery = true)
	List<Desk> getRoomDesks(String room);
}
