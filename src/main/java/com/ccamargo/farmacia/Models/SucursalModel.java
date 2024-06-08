/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccamargo.farmacia.Models;

/**
 *
 * @author Carlos Camargo
 */
public class SucursalModel {
    private int id;
    private String descripcion;
    private String direccion;
    private DistribuidorModel distribuidor;
    
    public SucursalModel(int _id, String _descripcion, String _direccion, DistribuidorModel _distribuidor){
        this.setId(_id);
        this.setDescripcion(_descripcion);
        this.setDistribuidor(_distribuidor);
        this.setDireccion(_direccion);
    }
    
    public void setId(int _id){id = _id;}
    public void setDescripcion(String _descripcion){descripcion = _descripcion;}
    public void setDistribuidor(DistribuidorModel _distribuidor){distribuidor = _distribuidor;}
    public void setDireccion(String _direccion){direccion = _direccion;}
    
    public int getId(){return id;}
    public String getDescription(){return descripcion;};
    public DistribuidorModel getDistribuidor(){return distribuidor;}
    public String getDireccion(){return direccion;}
    
}
