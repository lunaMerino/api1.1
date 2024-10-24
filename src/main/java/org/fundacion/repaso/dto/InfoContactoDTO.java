package org.fundacion.repaso.dto;

import org.fundacion.repaso.persistance.model.InfoContacto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InfoContactoDTO {

    private int idInfoContacto;
    private String direccion;
    private int telefono;
    private AlumnosDTO persona; //PA QUE

    public InfoContactoDTO(InfoContacto inf) {
        this.idInfoContacto = inf.getIdinfocontacto();
        this.direccion = inf.getDireccion();
        this.telefono = inf.getTelefono();
        this.persona = new AlumnosDTO(inf.getAlumnos());
    }
}
