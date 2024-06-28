package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Materia;

@Service
public interface IMateriaService {
	
	public void guardarMateria(Materia m);
	public List<Materia> mostrarMaterias();
	public void borrarMateria(String codigo);
	public void modificarMateria(Materia m);
	public Materia buscarMateria(String cod);

}
