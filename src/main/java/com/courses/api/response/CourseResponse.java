package com.courses.api.response;

import java.util.List;

import com.courses.api.entity.StudentEntity;

public class CourseResponse {

	private Long id;

	private String name;

	private String description;

	private String createDate;

	private String updateDate;

	private List<CategoryResponse> categories;

	private AccountResponse producer;

	private List<StudentResponse> students;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<CategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryResponse> categories) {
		this.categories = categories;
	}

	public AccountResponse getProducer() {
		return producer;
	}

	public void setProducer(AccountResponse producer) {
		this.producer = producer;
	}
	
	public List<StudentResponse> getStudents() {
		return students;
	}
	
	public void setStudents(List<StudentResponse> students) {
		this.students = students;
	}
}
