package org.fundacion.repaso.services;

import java.util.ArrayList;
import java.util.List;

import org.fundacion.repaso.dto.InfoContactoDTO;
import org.fundacion.repaso.persistance.model.InfoContacto;
import org.fundacion.repaso.persistance.repository.InfoContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoContactoImpl implements InfoContactoServiceI {

    @Autowired
    InfoContactoRepository docRepo;

    @Override
    public List<InfoContactoDTO> getAllInfoContactoDTO() {
        List<InfoContacto> docList = docRepo.findAll();
        List<InfoContactoDTO> docDTOList = new ArrayList<InfoContactoDTO>();

        for (InfoContacto documentoIdentidad : docList) {
            docDTOList.add(new InfoContactoDTO(documentoIdentidad));            
        }

        return docDTOList;
    }
    
}
