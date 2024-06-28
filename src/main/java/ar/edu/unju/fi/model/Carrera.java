package ar.edu.unju.fi.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Component
@Entity
public class Carrera {
	@Id
	private Integer codigoCar;
	private String nombre;
	private Integer duracion;
	@OneToMany(mappedBy="carrera", cascade=CascadeType.ALL)
	private List<Materia> materias;

}
