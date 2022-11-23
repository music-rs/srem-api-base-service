package com.srem.web.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "SREMUSUARI")
@Getter
@Setter
@ToString
public class UsuarioPerfil {

    @Id
    @Column(name = "USUA_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SREMUSUARI_SEQ")
    @SequenceGenerator(sequenceName = "SREMUSUARI_SEQ", allocationSize = 1, name = "SREMUSUARI_SEQ")
    private int id;

    @Column(name = "USUA_NOMBR")
    private String nombre;

    @Column(name = "USUA_APEPA")
    private String apellidoPaterno;

    @Column(name = "USUA_APEMA")
    private String apellidoMaterno;

    @Column(name = "USUA_NICKN")
    private String nombreUsuario;

    @Column(name = "USUA_PASSW")
    private String password;

    @Column(name = "USUA_EMAIL")
    private String email;

    @Column(name = "USUA_TIPO")
    private String tipo;

    @Column(name = "USUA_MUSIC")
    private String artistasInteres;

    @Column(name = "USUA_EVENT")
    private String eventosInteres;

    @Column(name = "USUA_GENER")
    private String generosMusicalesInteres;

    @Column(name = "USUA_DESCR")
    private String descripcionUsuario;

}
