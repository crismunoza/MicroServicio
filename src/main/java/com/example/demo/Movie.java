package com.example.demo;

public class Movie {
        //CREANDO LOS ATRIBUTOS DE LA CLASE Movie
        private int id;
        private String titulo;
        private String año;
        private String genero;
        private String director;
        private String sinopsis;
    
        //CREANDO EL CONSTRUCTOR DE LA CLASE Movie
        public Movie(int id, String titulo, String año, String genero, String director, String sinopsis) {
            this.id = id;
            this.titulo = titulo;
            this.año = año;
            this.genero = genero;
            this.director = director;
            this.sinopsis = sinopsis;
        }
        
        //CREANDO LOS METODOS GET PARA TRAER LOS ATRIBUTOS DE LA CLASE Movie
        public int getId() {
            return id;
        }
        public String getTitulo() {
            return titulo;
        }
        public String getAño() {
            return año;
        }
        public String getGenero() {
            return genero;
        }
        public String getDirector() {
            return director;
        }
        public String getSinopsis() {
            return sinopsis;
        }   
}
