package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;


@RestController
public class MovieController {
    //CREANDO LA LISTA PARA TRAER EL ARRAY DE MOVIES
    private List<Movie> movies = new ArrayList<>();
    
    //CREANDO EL CONSTRUCTOR PARA AGREGAR LAS PELICULAS
    public MovieController() {
        movies.add(new Movie(1, "Sueño de Fuga", "1994", "Drama", "Frank Darabont", "Dos hombres encarcelados"));
        movies.add(new Movie(2, "El Padrino", "1972", "Crimen", "Francis Ford Coppola", "El patriarca envejecido de una dinastía del crimen organizado transfiere el control de su imperio clandestino a su hijo reacio."));        
    }
    @GetMapping("/movie")
    public List<Movie> getMovie() {
        return movies;
    }

    //CREANDO EL METODO GET PARA TRAER UN ESTUDIANTE POR ID
    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable int id) {
        for (Movie Movie : movies) {
            if (Movie.getId() == id) {
                return Movie;
            }
        }
        return null;
    }
    
}
