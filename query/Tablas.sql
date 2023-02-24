
-----------------------------------------------
--CREACION DE TABLAS
CREATE TABLE USR_SREM.SREMUSUARI(
    USUA_ID NUMBER(15),
    USUA_NOMBR VARCHAR2(50),
    USUA_APEPA VARCHAR(20),
    USUA_APEMA VARCHAR(20),
    USUA_NICKN VARCHAR2(10),
    USUA_PASSW VARCHAR2(100),
    USUA_EMAIL VARCHAR2(100),
    USUA_TIPO CHAR(2),
    USUA_EVENT CLOB,
    USUA_MUSIC CLOB,
    USUA_GENER CLOB,
    USUA_DESCR CLOB,
    PRIMARY KEY (USUA_ID)
);

CREATE TABLE USR_SREM.SREMEVENTO(
    EVEN_ID NUMBER(15),
    EVEN_NOMBR VARCHAR2(100),
    EVEN_UBICA VARCHAR2(100),
    EVEN_UBIDE VARCHAR2(200),
    EVEN_UBIRE VARCHAR2(200),
    EVEN_DISTR VARCHAR2(30),
    EVEN_REGIO VARCHAR2(30),
    EVEN_FYHIN TIMESTAMP,
    EVEN_FYHIA TIMESTAMP,
    EVEN_FYHFI TIMESTAMP,
    EVEN_DESCR CLOB,
    EVEN_PRECIO NUMBER(4),
    EVEN_ORGAN VARCHAR2(50),
    EVEN_ASIST NUMBER(5),
    EVEN_INTER NUMBER(5),
    EVEN_COMPA NUMBER(5),
    EVEN_VALOR NUMBER(3),
    EVEN_IMAGE VARCHAR2(1300),
    EVEN_LINKE VARCHAR2(1300),
    PRIMARY KEY (EVEN_ID)
);

CREATE TABLE USR_SREM.SREMPARGEN(
    PAGE_ID NUMBER(15),
    PAGE_CODIG VARCHAR2(50),
    PAGE_VALOR VARCHAR2(500),
    PAGE_DESCR VARCHAR2(200),
    PRIMARY KEY (PAGE_ID)
);

CREATE TABLE USR_SREM.SREMUSUAIN(
    USIN_ID NUMBER(15),
    USUA_ID NUMBER(15),
    EVEN_ID NUMBER(15),
    USUA_NICKN VARCHAR2(10),
    EVEN_NOMBR VARCHAR2(100),
    USIN_INTER NUMBER(3),
    USIN_VISIT NUMBER(3),
    USIN_VALOR NUMBER(3),
    PRIMARY KEY (USIN_ID)
);

--CREACION DE SECUENCIAS
--CREATE SEQUENCE  "USR_SREM"."SREMUSFACE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 START WITH 1 CACHE 500 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;
CREATE SEQUENCE  "USR_SREM"."SREMUSUARI_SEQ"  MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 START WITH 1 CACHE 500 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;
CREATE SEQUENCE  "USR_SREM"."SREMEVENTO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 START WITH 1 CACHE 500 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;
CREATE SEQUENCE  "USR_SREM"."SREMPARGEN_SEQ"  MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 START WITH 1 CACHE 500 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;
CREATE SEQUENCE  "USR_SREM"."SREMUSUAIN_SEQ"  MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 START WITH 1 CACHE 500 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;



--===========================================
--INSERTAR DATA DE PRUEBA
INSERT INTO SREMUSUARI(USUA_ID,USUA_NOMBR,USUA_APEPA,USUA_APEMA,USUA_NICKN,USUA_PASSW,USUA_EMAIL,USUA_TIPO,USUA_EVENT,USUA_MUSIC,USUA_GENER,USUA_DESCR) values (SREMUSUARI_SEQ.NEXTVAL,'Jhonatan','Ibañez','Taccsi','US001','US001','jhonatan.pp2207@gmail.com','AD','KEANE , BRYAN ADAMS','KEANE , BRYAN ADAMS','Rock , Instrumental','Persona amante de los conciertos y de la música de Keane');
INSERT INTO SREMUSUARI(USUA_ID,USUA_NOMBR,USUA_APEPA,USUA_APEMA,USUA_NICKN,USUA_PASSW,USUA_EMAIL,USUA_TIPO,USUA_EVENT,USUA_MUSIC,USUA_GENER,USUA_DESCR) values (SREMUSUARI_SEQ.NEXTVAL,'Jose','Ibañez','Taccsi','US002','US002','jose@gmail.com','US','FIESTA HALLOWEEN CON MIRANDA , BRYAN ADAMS','MIRANDA , BRYAN ADAMS','Rock , POP','');
INSERT INTO SREMUSUARI(USUA_ID,USUA_NOMBR,USUA_APEPA,USUA_APEMA,USUA_NICKN,USUA_PASSW,USUA_EMAIL,USUA_TIPO,USUA_EVENT,USUA_MUSIC,USUA_GENER,USUA_DESCR) values (SREMUSUARI_SEQ.NEXTVAL,'Maria','Ibañez','Taccsi','US003','US003','maria@gmail.com','US','NOCHE DE GALA , CUMBIA VIP','GRUPO 5, ARMONIA 10','Cumbia , Salsa , Merengue','Vamos a bailar cumbiones!!');

--update SREMUSUARI set USUA_MUSIC = '40 Gramos , 6 voltios , AC/DC , ACHKIRIK , Aerosmith , Agua Marina , Almirante Ackbar , Amén , Arctic Monkeys , Armonía 10 , Astronaut Project , Autubus , Avenged Sevenfold , Axe Bahia , Banana Child , Bareto , Barrio Calavera , Bon Jovi , Bullet For My Valentine , Café Tacvba , Camilo Vega , Campo de Almas , Carajo , Coldplay , Crik Faluzi , Cuarteto de Nos , Cuchillazo , Cultura Profetica , D.L.G. , Diazepunk , Difonía , DLD , Dolores Delirio , Don Tetto , Dragonforce , Enanitos Verdes , Enjambre , Estado de Sitio , Fall Out Boy , Foo Fighters , Frank Sinatra , Franz Ferdinand , GAIA , Gian Marco , Gondwana , Green Day , Grupo 5 , Guns N'||CHR(39)||' Roses , Hermanos Yaipén , Hombres G , Imagine Dragons , Interpol , INYECTORES , Inzul , Iron Maiden , Jerry Rivera , Keane , Kings of Leon , La Bicicleta de Alan , La Maldita Costumbre , La Mente , La Mosca Tse-Tse , La Sarita , Laguna Pai , Líbido , Linkin Park , Little Jesus , Los Auténticos Decadentes , Los Bunkers , Los Cafres , Los Filipz , Los Outsaiders , Los Prisioneros , Mago Oz , Maná , Mar de Copas , Marc Anthony , Miki González , Miranda! , Molotov , MUSE , My Chemical Romance , No Recomendable , Nosequien y los Nosecuantos , N'||CHR(39)||'Samble , Oasis , Olaya Sound System , One Republic , Panda , Panic! At The Disco , Papa Roach , Pedro Suárez Vértiz , Plutonio de Alto Grado , Porta , Queen , R.E.M. , Radiohead , Rapper School , Rata Blanca , Raúl Romero , Red Hot Chili Peppers , Río , Slipknot , Soda Stereo , Sonata Arctica , Stereonoiz , Tame Impala , Temple Sour , The Beatles , The Killers , The Kooks , The Offspring , The Police , The Rasmus , The Strokes , Thirty Seconds to Mars , Tiempofuera , Tourista , Turbopótamos , Two Door Cinema Club , U2 , Uchpa , Vampire Weekend , Vicentico , Victor Manuelle , Vilma Palma e Vampiros , We The Lion , Zen ,' where USUA_ID='507';
--update SREMUSUARI set USUA_GENER = 'Cumbia , Disco , Folk , Heavy Metal , Indie , Punk , Reggae , Reggaeton , Rock , Salsa , Ska , Techno , ' where USUA_ID='507';


INSERT INTO SREMEVENTO(EVEN_ID,EVEN_NOMBR,EVEN_UBICA,
EVEN_UBIDE,EVEN_UBIRE,EVEN_DISTR,
EVEN_REGIO,EVEN_FYHIN,EVEN_FYHIA,
EVEN_FYHFI,EVEN_DESCR,EVEN_PRECIO,
EVEN_ORGAN,EVEN_ASIST,EVEN_INTER,
EVEN_COMPA,EVEN_VALOR,EVEN_IMAGE,
EVEN_LINKE)
VALUES (SREMEVENTO_SEQ.NEXTVAL, 'Zoe & Caloncho', 'Arena 1',
'Arena 1','Jockey Plaza','Surco',
'Lima',TO_DATE('2022/09/20 21:00:00', 'yyyy/mm/dd hh24:mi:ss'),TO_DATE('2022/09/20 21:00:00', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2022/09/20 21:00:00', 'yyyy/mm/dd hh24:mi:ss'),'Description', NULL,
'Movie Records', NULL, NULL,
NULL,NULL,'https://media.gq.com.mx/photos/6001cc2d136a880326643497/master/w_1600,c_limit/caloncho%20y%20adan%20jodorowski.jpg',
null);

INSERT INTO SREMUSUAIN(USIN_ID,USUA_ID,EVEN_ID,
USUA_NICKN,EVEN_NOMBR,USIN_INTER,
USIN_VISIT,USIN_VALOR)
values (SREMUSUAIN_SEQ.NEXTVAL,1,2,
'US001','Zoe & Caloncho',5,
1,5);