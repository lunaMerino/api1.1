package org.fundacion.repaso.dto;

import org.fundacion.repaso.persistance.model.Alumnos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrearAlumnosDTO {

    private int idAlumno;
    private String nombre;
    private String apellidos;

    public CrearAlumnosDTO(Alumnos al) {
        this.idAlumno = al.getIdAlumno();
        this.nombre = al.getNombre();
        this.apellidos = al.getApellidos();

    }
}
