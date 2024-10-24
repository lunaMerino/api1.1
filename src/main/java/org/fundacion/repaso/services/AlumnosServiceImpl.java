package org.fundacion.repaso.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.fundacion.repaso.dto.AlumnosDTO;
import org.fundacion.repaso.dto.CrearAlumnosDTO;
import org.fundacion.repaso.persistance.model.Alumnos;
import org.fundacion.repaso.persistance.repository.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnosServiceImpl implements AlumnosServiceI {

    @Autowired
    AlumnosRepository alumnosRepo;

    
    @Override
    public AlumnosDTO getAlumnoById(int idAlumno) {
        return new AlumnosDTO(alumnosRepo.findByIdAlumno(idAlumno));
    }

    @Override
    public List<AlumnosDTO> getAlumnoByNombre(String nombre) {
        List<Alumnos> alumnosList =alumnosRepo.findByNombre(nombre);
        List<AlumnosDTO> alumnosDTOList = new ArrayList<AlumnosDTO>();

        for (Alumnos alumno : alumnosList) {
            alumnosDTOList.add(new AlumnosDTO(alumno));
        }

        return alumnosDTOList;
    }

    @Override
    public void insertAlumno(CrearAlumnosDTO alumnos) {
        //Crear alumno a partir del DTO
        Alumnos newAlumno = new Alumnos();
        newAlumno.setIdAlumno(alumnos.getIdAlumno());
        newAlumno.setNombre(alumnos.getNombre());
        newAlumno.setApellidos(alumnos.getApellidos());

        //Guardar alumno
        alumnosRepo.save(newAlumno);
    }

    @Override
    public List<AlumnosDTO> getAlumnoByApellidos(String apellidos) {
        List<Alumnos> alumnosList =alumnosRepo.findByApellidos(apellidos);
        List<AlumnosDTO> alumnosDTOList = new ArrayList<AlumnosDTO>();

        for (Alumnos alumno : alumnosList) {
            alumnosDTOList.add(new AlumnosDTO(alumno));
        }

        return alumnosDTOList;
    }

    @Override
    public List<AlumnosDTO> findAll() {
        List<AlumnosDTO> alumnosDTOs = new ArrayList<>();
        List<Alumnos> alumnos = alumnosRepo.findAll();
        for(Alumnos a : alumnos){
            AlumnosDTO alu = new AlumnosDTO(a);
            alumnosDTOs.add(alu);
        }
        return alumnosDTOs;
    }
    
}
