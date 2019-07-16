package com.security.pet.model;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {

	@Id
	
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
	    @SequenceGenerator(sequenceName = "user_seq", allocationSize = 1, name = "USER_SEQ")
	private int userid;
	
	private String username;
	private String password;
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	@Transient
	private String passwordConfirm;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_role",
        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userid"),
        inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private Set<Role> roles;
	public User() {}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	
}
