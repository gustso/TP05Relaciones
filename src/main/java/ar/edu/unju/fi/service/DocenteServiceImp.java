package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.repository.DocenteRepository;

@Service
public class DocenteServiceImp implements IDocenteService{

	@Autowired
	DocenteRepository drepo;
	
	@Override
	public void guardarDocente(Docente docente) {
		// TODO Auto-generated method stub
		drepo.save(docente);
	}

	@Override
	public List<Docente> mostrarDocentes() {
		// TODO Auto-generated method stub
		return drepo.findAll();
	}

	@Override
	public void borrarDocente(String legajo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarDocente(Docente d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Docente buscarDocente(String leg) {
		// TODO Auto-generated method stub
		return null;
	}

}
