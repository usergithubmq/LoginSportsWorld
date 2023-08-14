/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sportsworld.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author miltonquiroz
 */

@Entity
@Data
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;
    private String celular;
    private String email;
    private String curp;
    private String mantenimiento;

   
}

