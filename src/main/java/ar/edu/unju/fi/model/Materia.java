package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Materia {
	
	@Id
	private String codigoMat;
	private String nombre;
	private String anio;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codigoCar")
	private Carrera carrera;
	
}
