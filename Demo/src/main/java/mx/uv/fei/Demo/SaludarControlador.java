package mx.uv.fei.Demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaludarControlador {
    String nombre;
    
    @GetMapping ("/saludos")
    public String saludar(){
       return "Hola Mundo " + nombre;    
    }

    @GetMapping ("/despedidas")
    public String despedirse(){
        return "Adios Mundo";
    }

    @PostMapping ("/nombramientos")
    public void nombre(){
        nombre = "Osmar";
    }

    @PutMapping ("/nombramientos")
    public void cambiarNombre(){
        nombre = "nombre-generico";
    }

    @DeleteMapping ("/nombramientos")
    public void eliminarNombre(){
        nombre = null;
    }
}
