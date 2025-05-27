package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    public List<Videojuego> buscarDestacados(){
        List<Videojuego> destacados = new ArrayList<>();
        
        Videojuego juego1 = new Videojuego();
        juego1.setNombre("The Legend of Zelda: Breath of the Wild");
        juego1.setDescription("Juego de aventuras y exploración en mundo abierto.");
        juego1.setImagenUrl("https://ejemplo.com/zelda.jpg");

        Videojuego juego2 = new Videojuego();
        juego2.setNombre("FIFA 24");
        juego2.setDescription("Simulador de fútbol con equipos y ligas reales.");
        juego2.setImagenUrl("https://ejemplo.com/fifa24.jpg");

        Videojuego juego3 = new Videojuego();
        juego3.setNombre("Call of Duty: Modern Warfare III");
        juego3.setDescription("Shooter en primera persona con modo multijugador.");
        juego3.setImagenUrl("https://ejemplo.com/cod.jpg");

        Videojuego juego4 = new Videojuego();
        juego4.setNombre("Minecraft");
        juego4.setDescription("Juego de construcción y supervivencia en mundo abierto.");
        juego4.setImagenUrl("https://ejemplo.com/minecraft.jpg");

        destacados.add(juego1);
        destacados.add(juego2);
        destacados.add(juego3);
        destacados.add(juego4);
        
        return destacados;
    }
}
