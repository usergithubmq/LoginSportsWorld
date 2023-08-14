/*
 * @author: Milton Quiroz
 */

package com.sportsworld.login.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sportsworld.login.model.Contacto;
import com.sportsworld.login.repository.ContactoRepository;

import java.util.List;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {
    
    private final ContactoRepository contactoRepository;
    
    @GetMapping()
    public List<Contacto> listContacto() { return contactoRepository.findAll();}
    
    
    
}

