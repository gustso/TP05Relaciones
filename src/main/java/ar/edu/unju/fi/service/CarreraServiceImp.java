package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.repository.CarreraRepository;

@Service
public class CarreraServiceImp implements ICarreraService{
	
	@Autowired
	CarreraRepository carreraRepository;

	@Override
	public void guardarCarrera(Carrera carrera) {
		// TODO Auto-generated method stub
		carreraRepository.save(carrera);
	}

	@Override
	public List<Carrera> mostrarCarreras() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}

	@Override
	public void borrarCarrera(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarCarrera(Carrera carrera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carrera buscarCarrera(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
