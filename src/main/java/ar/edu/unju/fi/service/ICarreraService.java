package ar.edu.unju.fi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.unju.fi.model.Carrera;

@Service
public interface ICarreraService {

	public void guardarCarrera(Carrera carrera);
	public List<Carrera> mostrarCarreras();
	public void borrarCarrera(Integer codigo);
	public void modificarCarrera(Carrera carrera);
	public Carrera buscarCarrera(Integer codigo);
	
}
