package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Component
@Entity
public class Docente {
	@Id
	private String legajo;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	@OneToOne
	@JoinColumn(name="codigo")
	private Materia materia;

}
