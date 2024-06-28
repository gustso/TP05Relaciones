package ar.edu.unju.fi.map;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import ar.edu.unju.fi.dto.DocenteDTO;
//import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DocenteMapDTO {

	@Mapping(source="legajo", target="legajo")
	@Mapping(source="nombre", target="nombre")
	@Mapping(source="apellido", target="apellido")	
	DocenteDTO convertirDocenteADocenteDTO(Docente d);
		
	@InheritInverseConfiguration
	Docente convertirDocenteDTOADocente(DocenteDTO ddto);

	List<DocenteDTO> convertirListaDocentesAListaDocentesDTO (List<Docente> listaD);
	
	List<Docente> convertirListaDocentesDTPAListaDocentes (List<DocenteDTO> listaD);
}
