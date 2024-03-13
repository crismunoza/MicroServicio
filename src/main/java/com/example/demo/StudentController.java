package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
public class StudentController {
    //CREANDO LA LISTA PARA TRAER EL ARRAY DE STUDENTS
    private List<Student> students = new ArrayList<>();
    
    //CREANDO EL CONSTRUCTOR PARA AGREGAR LOS ESTUDIANTES
    public StudentController() {
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Jane"));
    }

    //CREANDO EL METODO GET PARA TRAER LOS ESTUDIANTES
    @GetMapping("/student")
    public List<Student> getStudent() {
        return students;
    }

    //CREANDO EL METODO GET PARA TRAER UN ESTUDIANTE POR ID
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    
}
