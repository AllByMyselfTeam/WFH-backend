package com.app.service;

import java.util.List;

import com.app.pojo.Team;
import com.app.pojo.User;

public interface UserService {

	public User login(User user);

	public User register(User user);
	
	public User addUser(User user);

	public User getUserById(int userId);

//	public List<Team> addTeam(int id, Team team);

	public List<Team> addTeam(User user, Team team);

	List<Team> joinTeam(User user, Team team);

//	List<Team> addTeamByTeamId(int userid, int teamid);
}
