package com.github.sanchezih.jersey.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.sanchezih.jersey.entity.Curso;
import com.github.sanchezih.jersey.service.CursosService;
import com.github.sanchezih.jersey.service.HealthCheckService;

@Path("/cursos")
public class CursoController {

	public CursosService cursosService = new CursosService();

	public HealthCheckService hcs = new HealthCheckService();
	// http://localhost:8080/poc-jersey-crud/rest/cursos

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/sysinfo")
	public String getSystemInfo() {
		return hcs.getSysInfo();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Curso> getAllCursos() {
		return cursosService.getAllCursos();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Curso getCursoById(@PathParam("id") int id) {
		return cursosService.getCursoId(id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Curso addCurso(Curso curso) {
		return cursosService.addCurso(curso);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Curso updateCurso(Curso curso) {
		return cursosService.updateCurso(curso);
	}
}