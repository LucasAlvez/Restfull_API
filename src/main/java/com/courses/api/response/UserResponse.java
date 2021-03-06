package com.courses.api.response;

import java.util.Set;

public class UserResponse {
	
	private Long id;
	
	private String name;

	private String email;

	private Set<RoleResponse> roles;
	
	private String createDate;
	
	private String updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<RoleResponse> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<RoleResponse> roles) {
		this.roles = roles;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	public String getUpdateDate() {
		return updateDate;
	}
	
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
