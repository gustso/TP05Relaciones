package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.service.ICarreraService;
import ar.edu.unju.fi.service.IMateriaService;

@Controller
public class CarreraController {
	
	@Autowired
	Carrera c;
	
	@Autowired
	ICarreraService carser;
	
	@Autowired
	IMateriaService matser;
	
	@GetMapping("/formCarrera")
    public ModelAndView getFormCarrera() {        
		ModelAndView modelView = new ModelAndView("formCarrera");
		modelView.addObject("c",c);
		modelView.addObject("mats",matser.mostrarMaterias());				
        return modelView;
    }
	
	@PostMapping("/guardarCarrera")
	public ModelAndView saveCarrera(@ModelAttribute("nuevaCarrera") Carrera carParaGuardar) {
		//Estoy guardando la carrera en la materia
		//si no hago esto solo se está guardando la materia en carrera
		//fijarse mappedBy
		for (Materia m : carParaGuardar.getMaterias()) {
			m.setCarrera(carParaGuardar);
		}
		
		ModelAndView modelView = new ModelAndView("listaCarreras");			
		try {
			carser.guardarCarrera(carParaGuardar);	
		}catch(Exception e) {			
			modelView.addObject("errors", true);
			modelView.addObject("cargaDocenteErrorMessage", "Error al cargar en la BD" + e.getMessage());
			System.out.println(e.getMessage());
		}
		
		System.out.println("materia guardada correctamente");
				
		modelView.addObject("listadoCarreras", carser.mostrarCarreras());				
		return modelView;		
	}

}
