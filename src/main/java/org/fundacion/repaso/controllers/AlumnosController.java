package org.fundacion.repaso.controllers;

import java.util.List;

import org.fundacion.repaso.dto.AlumnosDTO;
import org.fundacion.repaso.dto.CrearAlumnosDTO;
import org.fundacion.repaso.services.AlumnosServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api/v1/alumno")
@CrossOrigin
public class AlumnosController {

    @Autowired
    AlumnosServiceI alumnoMngmnt;
    @GetMapping
    public List<AlumnosDTO> findAll(){
        return alumnoMngmnt.findAll();

    }
    
    @GetMapping("/id/{idalumno}")
    public AlumnosDTO selectWhereIdAlumnosDTO(@PathVariable int idalumno) {
        return alumnoMngmnt.getAlumnoById(idalumno);
    }

    @GetMapping("/nombre/{nombre}")
    public List<AlumnosDTO> selectWhereNombreAlumnosDTO(@PathVariable String nombre) {
        return alumnoMngmnt.getAlumnoByNombre(nombre);
    }

    @GetMapping("/apellidos/{apellidos}")
    public List<AlumnosDTO> selectWhereApellidoAlumnosDTO(@PathVariable String apellidos) {
        return alumnoMngmnt.getAlumnoByApellidos(apellidos);
    }
    

    @PostMapping("/insert")
    public void insertAlumno(@RequestBody CrearAlumnosDTO alumno) {
        alumnoMngmnt.insertAlumno(alumno);
    }
    
    

}
