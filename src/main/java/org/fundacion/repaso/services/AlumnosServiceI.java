package org.fundacion.repaso.services;


import java.util.List;

import org.fundacion.repaso.dto.AlumnosDTO;
import org.fundacion.repaso.dto.CrearAlumnosDTO;

public interface AlumnosServiceI {
    List<AlumnosDTO> findAll();
    AlumnosDTO getAlumnoById(int idalumno);
    List<AlumnosDTO> getAlumnoByNombre(String nombre);
    List<AlumnosDTO> getAlumnoByApellidos(String apellidos);
    void insertAlumno(CrearAlumnosDTO alumno);
}