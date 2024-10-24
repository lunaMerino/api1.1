package org.fundacion.repaso.persistance.repository;

import java.util.List;

import org.fundacion.repaso.persistance.model.Alumnos;
import org.fundacion.repaso.persistance.model.InfoContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoContactoRepository extends JpaRepository<InfoContacto, Integer>{
    Alumnos findByIdinfocontacto(int idinfocontacto);
    List<Alumnos> findByDireccion(String direccion);
    Alumnos findByTelefono(int telefono);
    Alumnos findByAlumnos_idAlumno(int alumos_idalumno);

}
