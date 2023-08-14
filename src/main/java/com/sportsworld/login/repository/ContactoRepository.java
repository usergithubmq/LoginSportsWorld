/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sportsworld.login.repository;

import com.sportsworld.login.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author miltonquiroz
 */
@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
