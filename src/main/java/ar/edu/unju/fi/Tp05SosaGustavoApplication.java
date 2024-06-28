package ar.edu.unju.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.service.IMateriaService;

@SpringBootApplication
public class Tp05SosaGustavoApplication implements CommandLineRunner{

	@Autowired
	IMateriaService matser;
	
	public static void main(String[] args) {
		SpringApplication.run(Tp05SosaGustavoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Materia m1 = new Materia();
		m1.setAnio("3");
		m1.setCodigo("cod01");
		m1.setNombre("Mates");
		Materia m2 = new Materia("cod02","PV","3ro");
		Materia m3 = new Materia("cod03","Algebra","3ro");
		
		matser.guardarMateria(m1);
		matser.guardarMateria(m2);
		matser.guardarMateria(m3);
		*/
	}

}
