package com.courses.api.request;

import static com.courses.api.validations.BeanValidation.*;

import java.util.List;

import static com.courses.api.validations.BeanValidation.REQUIRED_CATEGORY;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CourseRequest {

	@NotBlank(message = REQUIRED_NAME)
	private String name;

	private String description;

	@NotNull(message = REQUIRED_DURATION)
	private Integer duration;
	
	@NotEmpty(message = REQUIRED_CATEGORY)
	private List<Long> categories;
	
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

	public Integer getDuration(){
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public List<Long> getCategories() {
		return categories;
	}
	
	public void setCategories(List<Long> categories) {
		this.categories = categories;
	}
}
