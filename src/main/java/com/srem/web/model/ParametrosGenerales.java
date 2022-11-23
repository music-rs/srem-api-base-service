package com.srem.web.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SREMPARGEN")
@Getter
@Setter
@ToString
public class ParametrosGenerales {

    @Id
    @Column(name = "PAGE_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SREMPARGEN_SEQ")
    @SequenceGenerator(sequenceName = "SREMPARGEN_SEQ", allocationSize = 1, name = "SREMPARGEN_SEQ")
    private int id;

    @Column(name = "PAGE_CODIG")
    private String codigo;

    @Column(name = "PAGE_VALOR")
    private String valor;

    @Column(name = "PAGE_DESCR")
    private String descripcion;

}
