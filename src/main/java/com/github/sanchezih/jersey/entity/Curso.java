package com.github.sanchezih.jersey.entity;

public class Curso {

	private int idCurso;
	private String nombreCurso;
	private String horarioCurso;

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getHorarioCurso() {
		return horarioCurso;
	}

	public void setHorarioCurso(String horarioCurso) {
		this.horarioCurso = horarioCurso;
	}

	@Override
	public String toString() {
		return "Cursos [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", horarioCurso=" + horarioCurso + "]";
	}
}