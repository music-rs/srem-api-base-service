package com.srem.web.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "SREMUSUAIN")
@Getter
@Setter
@ToString
public class InteresesUsuario {

    @Id
    @Column(name = "USIN_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SREMUSUAIN_SEQ")
    @SequenceGenerator(sequenceName = "SREMUSUAIN_SEQ", allocationSize = 1, name = "SREMUSUAIN_SEQ")
    private int id;

    @Column(name = "USUA_ID")
    private int idUsuario;

    @Column(name = "EVEN_ID")
    private int idEvento;

    @Column(name = "USUA_NICKN")
    private String nombreUsuario;

    @Column(name = "EVEN_NOMBR")
    private String nombreEvento;

    @Column(name = "USIN_INTER")
    private int interes;

    @Column(name = "USIN_VISIT")
    private int cantidadVisitas;

    @Column(name = "USIN_VALOR")
    private int valoracion;

}
