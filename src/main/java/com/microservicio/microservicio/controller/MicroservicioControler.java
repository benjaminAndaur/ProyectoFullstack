package com.microservicio.microservicio.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.model.Fruta;
import com.microservicio.model.Usuario;
import com.microservicio.repository.FrutaRepository;

import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/ejemplo")
public class MicroservicioControler {

    private static final Logger logger = LoggerFactory.getLogger(MicroservicioControler.class);
    /* EJERCICIO 1 */
    @GetMapping("/casoUso1")
    public String obtenerStatus(){

        logger.info("Se esta consultando el Endpoint /casoUso1");

        return "El ms esta activo👍";
        
    } 
    @PostMapping("/casoUso2")
    public Usuario devolverDatosUsuario(@RequestBody Usuario data){
        
        logger.info("LLego esta data "+ data);
        
        Usuario usuarioADevolver = Usuario.builder()
        .nombre(data.getNombre())
        .correo(data.getCorreo())
        .build();

        logger.info(""+usuarioADevolver);

        return usuarioADevolver;
    }

    @GetMapping("/casoUso3/")
    public int obtenerSuma(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @GetMapping("/casoUso4")
    public List<Fruta> obtenerFrutas(){
        FrutaRepository frutaRepository = new FrutaRepository();

        List<Fruta> stockAcual = frutaRepository.listaFrutas;
        
        return stockAcual;
    }



    
}