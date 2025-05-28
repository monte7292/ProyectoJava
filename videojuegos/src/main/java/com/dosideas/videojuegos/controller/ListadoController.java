package com.dosideas.videojuegos.controller;

import org.springframework.ui.Model;
import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    
    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
    
    
    
    //Esto basicamente indica que el mapping es la ruta que rediccionará
    //Esto returna listado en la funcion videojuego que eso es el HTML
    @RequestMapping("/")
    public String listarVideoJuegos(Model model){
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        
        //Busqueda de Videojuegos
        return "listado";
    }
}
