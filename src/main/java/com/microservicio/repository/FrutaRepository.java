package com.microservicio.repository;

import java.util.List;

import com.microservicio.model.Fruta;


import lombok.NoArgsConstructor;
@NoArgsConstructor


public class FrutaRepository {
    public final List<Fruta> listaFrutas = List.of(
        Fruta.builder().nombre("manzana").color("rojo").build(),
        Fruta.builder().nombre("banana").color("amarillo").build(),
        Fruta.builder().nombre("uva").color("morado").build(),
        Fruta.builder().nombre("naranja").color("naranja").build(),
        Fruta.builder().nombre("kiwi").color("verde").build(),
        Fruta.builder().nombre("sandia").color("verde").build(),
        Fruta.builder().nombre("fresa").color("rojo").build(),
        Fruta.builder().nombre("piña").color("amarillo").build()
    );
}
