/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dinamo.app1.Controller;
/*@author Iris*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;
import com.dinamo.model.Persona;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.DeleteMapping;

        
@RestController /*Indica que está será la capa controladora*/
public class Controller {
    
    List<Persona> listaPersonas = new ArrayList(); /*Armo una lista de c/u q entraa ala pag */
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/hola/{nombre}/{apellido}")/*Para identificar el método utilizo la annotation especial de esta IDE, el parentesis me dice en que url se ejecuta el metodo*/
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido){
        return "Aloha " + nombre + apellido + " Bienvenid@!";
    } 
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre,
                             @RequestParam String apellido) {
        return "Chau " + nombre + " "  + apellido + " T__T";
    }
    
    @PostMapping ("/new/persona")  /*Endpoint para que se ejecute luego del metodo post*/
    public void agregarPersona (@RequestBody Persona pers) {
        listaPersonas.add(pers);
    }
    
    @GetMapping ("/ver/personas") /*Para ver la lista en la pag*/
    @ResponseBody                 /* Para q me devuelva la rta en lenguaje java*/
    public List<Persona> verPersonas (){
        return listaPersonas;
    }
    
    @DeleteMapping ("/delete/{id}")
     public void borrarPersona (Long id) {
         
     }    
}
