package org.fundacion.repaso.persistance.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alumnos")
@Data
@NoArgsConstructor
public class Alumnos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idalumno", nullable = false)
    private int idAlumno;

    @Column(name="nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name="apellidos", length = 90, nullable = false)
    private String apellidos;


    @OneToOne(mappedBy = "alumnos", fetch= FetchType.LAZY, cascade=CascadeType.ALL, optional = false)
    private InfoContacto idinfocontacto;
}
