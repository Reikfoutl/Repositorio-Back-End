/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dinamo.service;

import com.dinamo.model.Persona;
import com.dinamo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService  implements PersonaService{
    @Autowired
    public PersonaRepository persoRepo;
    
    
    @Override
    public void List<Persona> verPersonas() {
         persoRepo.findAll();
    }
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }
    
    @Override
    public void borrarPersona(Persona per) {
        persoRepo.delete(per);
    }
    
    @Override
    public void buscarPersona(Persona per) {
        persoRepo.findById(Id).orElse(null);
    }
}
