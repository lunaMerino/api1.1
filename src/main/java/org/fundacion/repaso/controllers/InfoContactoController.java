package org.fundacion.repaso.controllers;

import java.util.List;

import org.fundacion.repaso.dto.InfoContactoDTO;
import org.fundacion.repaso.services.InfoContactoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/infoContacto")
@CrossOrigin
public class InfoContactoController {

    @Autowired
    InfoContactoServiceI docMngmnt;
    
    @GetMapping
    public List<InfoContactoDTO> getAll() {
        return docMngmnt.getAllInfoContactoDTO();
    }
    
}
