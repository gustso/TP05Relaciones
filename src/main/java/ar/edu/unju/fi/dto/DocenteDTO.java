package ar.edu.unju.fi.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DocenteDTO {

	private String legajo;
	private String nombre;
	private String apellido;
	//private String carrera;
}
