package com.courses.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.courses.api.enums.CourseSort;
import com.courses.api.enums.SortOrder;
import com.courses.api.request.CourseRequest;
import com.courses.api.response.CourseResponse;
import com.courses.api.service.CourseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "courses", description = "Cursos")
@RequestMapping(value = "/v1/courses")
public class CourseController extends Controller {

	@Autowired
	CourseService courseService;

	@ApiOperation(value = "Cria um curso")
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	// @PreAuthorize(Permissions.DEFAULT)
	public CourseResponse create(@RequestBody @Valid CourseRequest request, BindingResult result)
			throws ResourceNotFoundException, Exception {
		verifyInvalidParam(result);
		return courseService.create(request);
	}

	@ApiOperation(value = "Busca curso pelo seu id")
	@RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	// @PreAuthorize(Permissions.DEFAULT)
	public CourseResponse findById(@PathVariable("courseId") @Valid Long courseId) throws Exception {
		return courseService.findById(courseId);
	}

	@ApiOperation(value = "Atuzaliza um curso")
	@RequestMapping(value = "/{courseId}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	// @PreAuthorize(Permissions.DEFAULT)
	public CourseResponse update(@RequestBody @Valid CourseRequest request,
			@PathVariable("courseId") @Valid Long courseId, BindingResult result) throws Exception {
		verifyInvalidParam(result);
		return courseService.update(request, courseId);
	}

	@ApiOperation(value = "Lista todos os cursos da plataforma")
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	// @PreAuthorize(Permissions.DEFAULT)
	public Page<CourseResponse> listAll(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "24") Integer size,
			@RequestParam(value = "sortBy", defaultValue = "id") CourseSort sortBy,
			@RequestParam(value = "sortOrder", defaultValue = "DESC") SortOrder sortOrder) throws Exception {
		return courseService.listAll(page, size, sortBy, sortOrder);
	}

	@ApiOperation(value = "Deleta um curso")
	@RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	// @PreAuthorize(Permissions.DEFAULT)
	public void delete(@PathVariable("courseId") @Valid Long courseId) throws Exception {
		courseService.delete(courseId);
	}

	@ApiOperation(value = "Adiciona aluno a um curso")
	@RequestMapping(value = "/{courseId}/students", method = RequestMethod.PATCH)
	@ResponseStatus(value = HttpStatus.OK)
	// @PreAuthorize(Permissions.DEFAULT)
	public CourseResponse addStudent(@PathVariable("courseId") @Valid Long courseId) throws Exception {
		return courseService.addStudent(courseId);
	}
}
