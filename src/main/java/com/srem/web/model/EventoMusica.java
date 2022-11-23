package com.srem.web.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SREMEVENTO")
@Getter
@Setter
@ToString
public class EventoMusica {

    @Id
    @Column(name = "EVEN_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SREMEVENTO_SEQ")
    @SequenceGenerator(sequenceName = "SREMEVENTO_SEQ", allocationSize = 1, name = "SREMEVENTO_SEQ")
    private int id;

    @Column(name = "EVEN_NOMBR")
    private String nombreEvento;

    @Column(name = "EVEN_UBICA")
    private String ubicacion;

    @Column(name = "EVEN_UBIDE")
    private String ubicacionDetalle;

    @Column(name = "EVEN_UBIRE")
    private String ubicacionReferencia;

    @Column(name = "EVEN_DISTR")
    private String distrito;

    @Column(name = "EVEN_REGIO")
    private String region;

    @Column(name = "EVEN_FYHIN")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaYHoraInicio;

    @Column(name = "EVEN_FYHIA")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaYHoraInicioAlternativa;

    @Column(name = "EVEN_FYHFI")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaYHoraFin;

    @Column(name = "EVEN_DESCR")
    private String descripcion;

    @Column(name = "EVEN_PRECIO")
    private Integer precio;

    @Column(name = "EVEN_ORGAN")
    private String organizador;

    @Column(name = "EVEN_ASIST")
    private Integer cantidadAsistere;

    @Column(name = "EVEN_INTER")
    private Integer cantidadInteresados;

    @Column(name = "EVEN_COMPA")
    private Integer cantidadCompartidos;

    @Column(name = "EVEN_VALOR")
    private Integer valoracionGeneral;

    @Column(name = "EVEN_IMAGE")
    private String imagen;

    @Column(name = "EVEN_LINKE")
    private String enlace;

}
