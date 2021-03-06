package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Checklist;

@Repository
public interface ChecklistRepository extends JpaRepository<Checklist, Integer> {
	public List<Checklist> findAllByUid(int userId);

}
