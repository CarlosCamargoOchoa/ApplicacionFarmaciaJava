/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccamargo.farmacia.Models;

import java.util.ArrayList;


/**
 *
 * @author Carlos Camargo
 */
public class PedidoEncabezadoModel {
    private int id;
    private ArrayList<SucursalModel> sucursales;
    
    public PedidoEncabezadoModel(int _id){
        this.setId(_id);
        sucursales = new ArrayList<SucursalModel>();
    }
    
    public void setId(int _id){id = _id;}
    public void setSucursal(SucursalModel _sucursal){sucursales.add(_sucursal);}
    
    public int getId(){return id;}
    public ArrayList<SucursalModel> getSucursales(){return sucursales;}
    
    public void LimpiarSucursales(){
        this.sucursales.clear();
    }
}
