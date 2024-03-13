package com.example.demo;

public class Student {

    //CREANDO LOS ATRIBUTOS DE LA CLASE STUDENT
    private int id;
    private String name;

    //CREANDO EL CONSTRUCTOR DE LA CLASE STUDENT
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    //CREANDO LOS METODOS GET PARA TRAER LOS ATRIBUTOS DE LA CLASE STUDENT
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
}
