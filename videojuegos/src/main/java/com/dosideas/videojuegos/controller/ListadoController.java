package com.dosideas.videojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    //Esto basicamente indica que el mapping es la ruta que rediccionará
    //Esto returna listado en la funcion videojuego que eso es el HTML
    @RequestMapping("/")
    public String listaVideoJuegos(){
        //Busqueda de Videojuegos
        return "listado";
    }
}
