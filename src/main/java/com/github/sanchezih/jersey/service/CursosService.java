package com.github.sanchezih.jersey.service;

import java.util.ArrayList;

import javax.net.ssl.SSLEngineResult.Status;
import javax.ws.rs.core.Response;

import com.github.sanchezih.jersey.entity.Curso;

public class CursosService {

	public static ArrayList<Curso> listaCursos = new ArrayList<Curso>();

	public CursosService() {
		super();
		getCursos();
	}

	private static ArrayList<Curso> getCursos() {
		if (listaCursos.isEmpty()) {
			Curso c1 = new Curso();
			c1.setIdCurso(1);
			c1.setNombreCurso("Fullstack");
			c1.setHorarioCurso("08:00 - 10:00");
			listaCursos.add(c1);
			Curso c2 = new Curso();
			c2.setIdCurso(2);
			c2.setNombreCurso("DBA");
			c2.setHorarioCurso("09:00 - 10:00");
			listaCursos.add(c2);
		}
		return listaCursos;
	}

	public ArrayList<Curso> getAllCursos() {
		return (listaCursos.isEmpty() ? getCursos() : listaCursos);
	}

	public Curso getCursoId(int id) {
		int indice = 0;
		for (Curso curso : listaCursos) {
			if (curso.getIdCurso() == id) {
				return listaCursos.get(indice);
			}
			indice++;
		}
		return null;
	}

	public Curso addCurso(Curso curso) {
		Curso c = new Curso();
		c.setIdCurso(listaCursos.size() + 1);
		c.setNombreCurso(curso.getNombreCurso());
		c.setHorarioCurso(curso.getHorarioCurso());
		try {
			listaCursos.add(c);
			return curso;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Curso updateCurso(Curso curso) {
		Curso c = new Curso();
		c.setIdCurso(curso.getIdCurso());
		c.setNombreCurso(curso.getNombreCurso());
		c.setHorarioCurso(curso.getHorarioCurso());
		try {
			listaCursos.set(curso.getIdCurso() - 1, c);
			return c;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Response deleteCurso(int id) {
		try {
			listaCursos.remove(id - 1);
			return Response.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}