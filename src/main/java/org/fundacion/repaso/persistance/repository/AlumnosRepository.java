package org.fundacion.repaso.persistance.repository;

import java.util.List;

import org.fundacion.repaso.persistance.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos, Integer> {

    Alumnos findByIdAlumno(int idalumno);
    List<Alumnos> findByNombre(String nombre);
    List<Alumnos> findByApellidos(String apellido);
    Alumnos save(Alumnos alumno);
}
