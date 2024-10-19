package com.unu.Poo2.model;

import java.util.ArrayList;
import java.util.List;

import com.unu.Poo2.beans.autor;

public class AutorModel {

	public List<autor> listarAutores() {
		ArrayList<autor> autores = new ArrayList<>();

		autores.add(new autor(1, "Garcia Marquez", "Colombia"));
		autores.add(new autor(2,"Borges", "Argentina"));
		autores.add(new autor(3, "Allende", "Chilena"));
		return autores;

	}
}
