package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting,Integer> {	
	public List<Meeting> findAllByTeam(int team);
}
