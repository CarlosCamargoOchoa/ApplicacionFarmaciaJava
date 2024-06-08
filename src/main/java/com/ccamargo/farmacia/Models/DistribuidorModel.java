/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccamargo.farmacia.Models;

/**
 *
 * @author Carlos Camargo
 */
public class DistribuidorModel {
    private int id;
    private String descripcion;
    
    public DistribuidorModel(int _id, String _descripcion){
        this.setId(_id);
        this.setDescripcion(_descripcion);
    }
    
    public void setId(int _id){id = _id;}
    public void setDescripcion(String _descripcion){descripcion = _descripcion;}
    public int getId(){return id;}
    public String getDescription(){return descripcion;};
}
