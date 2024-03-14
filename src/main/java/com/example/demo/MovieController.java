package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;


@RestController
public class MovieController {
    //CREANDO LA LISTA PARA TRAER EL ARRAY DE MOVIES
    private List<Movie> movies = new ArrayList<>();
    
    //CREANDO EL CONSTRUCTOR PARA AGREGAR LAS MOVIE
    public MovieController() {
        movies.add(new Movie(1, "Sueño de Fuga", "1994", "Drama", "Frank Darabont", "Dos hombres encarcelados"));
        movies.add(new Movie(2, "El Padrino", "1972", "Crimen", "Francis Ford Coppola", "El patriarca envejecido de una dinastía del crimen organizado transfiere el control de su imperio clandestino a su hijo reacio.")); 
        movies.add(new Movie(3, "El Padrino II", "1974", "Crimen", "Francis Ford Coppola", "Secuela del Padrino"));
        movies.add(new Movie(4, "El Padrino III", "1990", "Crimen", "Francis Ford Coppola", "Tercera parte de la trilogía del Padrino"));
        movies.add(new Movie(5, "Pulp Fiction", "1994", "Drama/Crimen", "Quentin Tarantino", "Historias interrelacionadas en el mundo del crimen de Los Ángeles"));
        movies.add(new Movie(6, "Forrest Gump", "1994", "Drama", "Robert Zemeckis", "Historia de vida de un hombre con discapacidad intelectual"));
       
    }
    @GetMapping("/movie")
    public List<Movie> getMovie() {
        return movies;
    }

    //CREANDO EL METODO GET PARA TRAER UNA MOVIE POR ID
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
