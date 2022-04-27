package com.github.sanchezih.jersey.service;

import java.util.ArrayList;

import com.github.sanchezih.jersey.entity.Curso;

public class CursosService {

	public static ArrayList<Curso> listaCursos = new ArrayList<Curso>();

	private static ArrayList<Curso> getCursos() {
		if (listaCursos != null) {
			Curso c1 = new Curso();
			c1.setIdCurso(1);
			c1.setNombreCurso("Fullstack");
			c1.setHorarioCurso("08:00 - 10:00");
			listaCursos.add(c1);
		}
		return listaCursos;
	}

	public ArrayList<Curso> getAllCursos() {
		return (listaCursos.isEmpty() ? getCursos() : listaCursos);
	}
}
