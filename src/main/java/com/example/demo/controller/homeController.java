package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class homeController {
	
	@Value("${title.generic}")
	private String tittlePage;

	@GetMapping({"/home", "/inicio", "/", "/Home", "/Inicio"})
	public String HolaMundo(Model model) {
		
		List<String> listita = new ArrayList<>();
		listita.add("Primer Elemento");
		listita.add("Segundo Elemento");
		listita.add("Tercero Elemento");
		listita.add("Cuarto Elemento");
		listita.add("Quinto Elemento");
		listita.add("Secto Elemento");
		listita.add("Septimo Elemento");
		
		model.addAttribute("TituloPagina", tittlePage);
		model.addAttribute("titulo", "Seccion j98");
		model.addAttribute("listita", listita);
		
		return "Home";
		
	}
}
