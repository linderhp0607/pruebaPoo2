package com.unu.Poo2.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.unu.Poo2.model.AutorModel;


public class autoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	AutorModel modelo= new AutorModel();
	
    public autoresController() {
        super();
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	if (request.getParameter("op")== null) {
			listar(request,response);
    		return;
		}
    }
    
    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setAttribute("listaAutores", modelo.listarAutores());
    	request.getRequestDispatcher("/autor/listaAutores.jsp").forward(request, response);
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

}
