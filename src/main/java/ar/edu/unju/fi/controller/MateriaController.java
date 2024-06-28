package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.service.ICarreraService;
import ar.edu.unju.fi.service.IMateriaService;

@Controller
public class MateriaController {
	
	@Autowired
	Materia m;
	
	@Autowired
	ICarreraService carser;
	
	@Autowired
	IMateriaService matser;
	
	@GetMapping("/formMateria")
    public ModelAndView getFormMateria() {        
		ModelAndView modelView = new ModelAndView("formMateria");
		modelView.addObject("m",m);
		modelView.addObject("carreras",carser.mostrarCarreras());				
        return modelView;
    }
	
	@PostMapping("/guardarMateria")
	public ModelAndView saveMateria(@ModelAttribute("nuevaMateria") Materia matParaGuardar) {
		//List matParaGuardar.getCodigoMat()
		
		ModelAndView modelView = new ModelAndView("listaMaterias");			
		try {
			matser.guardarMateria(matParaGuardar);	
		}catch(Exception e) {			
			modelView.addObject("errors", true);
			modelView.addObject("cargaDocenteErrorMessage", "Error al cargar en la BD" + e.getMessage());
			System.out.println(e.getMessage());
		}
		
		System.out.println("materia guardada correctamente");
				
		modelView.addObject("listadoMaterias", matser.mostrarMaterias());				
		return modelView;		
	}

	
	
}
