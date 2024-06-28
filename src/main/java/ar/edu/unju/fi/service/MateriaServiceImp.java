package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.repository.MateriaRepository;

@Service
public class MateriaServiceImp implements IMateriaService{

	@Autowired
	MateriaRepository materiarepo;
	@Override
	public void guardarMateria(Materia m) {
		// TODO Auto-generated method stub
		materiarepo.save(m);
		
	}

	@Override
	public List<Materia> mostrarMaterias() {
		// TODO Auto-generated method stub
		return materiarepo.findAll();
	}

	@Override
	public void borrarMateria(String codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarMateria(Materia m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia buscarMateria(String cod) {
		// TODO Auto-generated method stub
		return null;
	}

}
