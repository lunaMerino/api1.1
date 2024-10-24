package org.fundacion.repaso.persistance.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "infocontacto")
@Data
@NoArgsConstructor
public class InfoContacto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idinfocontacto", nullable = false)
    private int idinfocontacto;

    @Column(name="direccion")
    private String direccion;

    @Column(name="telefono")
    private int telefono;

    @OneToOne
    @JoinColumn(name="alumnos_idalumno", referencedColumnName = "idalumno")
    private Alumnos alumnos;
}
