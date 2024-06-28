package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.service.IDocenteService;
import ar.edu.unju.fi.service.IMateriaService;

@Controller
public class DocenteController {
	@Autowired
	Docente docente;

	@Autowired
	Materia materia;
	
	@Autowired
	IMateriaService matser;
	
	@Autowired
	IDocenteService docser;
	
	@GetMapping("/formDocente")
    public ModelAndView getFormDocente() {
        
		ModelAndView modelView = new ModelAndView("formDocente");
		
		//agregando datos al docente
		docente.setApellido("Sosa");
		
		modelView.addObject("d",docente);
		modelView.addObject("mats",matser.mostrarMaterias());
				
        return modelView;
    }
	
	@PostMapping("/guardarDocente")
	public ModelAndView saveCarrera(@ModelAttribute("nuevaCarrera") Docente docParaGuardar) {
		ModelAndView modelView = new ModelAndView("listaDocente");			
		//guardar
		//ListadoCarreras.agregarCarrera(carreraParaGuardar);
		try {
			docser.guardarDocente(docParaGuardar);	
		}catch(Exception e) {
			boolean errors = true;
			modelView.addObject("errors", errors);
			modelView.addObject("cargaDocenteErrorMessage", "Error al cargar en la BD" + e.getMessage());
			System.out.println(e.getMessage());
		}
		
		System.out.println("docente guardado correctamente");
		//mostrar el listado
		
		modelView.addObject("listadoDocentes", docser.mostrarDocentes());	
		//modelView.addObject("listadoCarreras", carreraService.mostrarCarreras());
		
		return modelView;		
	}
}
