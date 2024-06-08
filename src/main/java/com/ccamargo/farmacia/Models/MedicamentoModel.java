/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccamargo.farmacia.Models;

/**
 *
 * @author Carlos Camargo
 */
public class MedicamentoModel {
    
    private int id;
    private String descripcion;
    private TipoMedicamentoModel tipoMedicamento;
    
    MedicamentoModel(int _id, String _descripcion, TipoMedicamentoModel _tipoMedicamento){
        this.setId(_id);
        this.setDescripcion(_descripcion);
        this.setTipoMedicamento(_tipoMedicamento);
    }
    
    public void setId(int _id){id = _id;}
    public void setDescripcion(String _descripcion){descripcion = _descripcion;}
    public void setTipoMedicamento(TipoMedicamentoModel _tipoMedicamento){tipoMedicamento = _tipoMedicamento;}
    
    public int getId(){return id;}
    public String getDescription(){return descripcion;};
    public TipoMedicamentoModel getTipoMedicamento(){return tipoMedicamento;};
}
