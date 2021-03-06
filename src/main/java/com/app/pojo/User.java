package com.app.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table (name="user")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column (name="user_id")
	int userId;
	@Column (name="username", nullable=false, unique=true)
	String username;
	@Column (name="password", nullable=false)
	String password;
	@Column (name="fname", nullable=false)
	String fname;
	@Column (name="lname", nullable=false)
	String lname;
	@Column (name="email", nullable=false)
	String email;
	@Column (name="phone", nullable=false)
	String phone;
	@Column (name="title", nullable=true)
	String title;
	@ManyToMany
	@JoinTable(
			  name = "User_Team", 
			  joinColumns = @JoinColumn(name = "userid"), 
			  inverseJoinColumns = @JoinColumn(name = "teamid"))
	List<Team> teams;

}
