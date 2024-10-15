package com.unu.Poo2.beans;

public class autor {

	private int idAutor;
	private String nacionalidad;
	private String nombreAutor;

	

	public autor(int idAutor, String nacionalidad, String nombreAutor) {
		super();
		this.idAutor = idAutor;
		this.nacionalidad = nacionalidad;
		this.nombreAutor = nombreAutor;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

}
