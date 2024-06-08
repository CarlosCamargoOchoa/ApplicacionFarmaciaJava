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
public class PedidoDetalleModel {
    private int id;
    private PedidoEncabezadoModel encabezado;
    private ArrayList<MedicamentoModel> medicamentos;
    
    public PedidoDetalleModel(int _id){
        this.setId(_id);
        medicamentos = new ArrayList<MedicamentoModel>();
    }
    
    public void setId(int _id){id = _id;}
    public void setEncabezado(PedidoEncabezadoModel _encabezado){encabezado = _encabezado;}
    public void setMedicamentos(MedicamentoModel _medicamento){medicamentos.add(_medicamento);}
    
    public int getId(){ return id;}
    public PedidoEncabezadoModel getEncabezado(){return encabezado;}
    public ArrayList<MedicamentoModel> getMedicamentos(){return medicamentos;}
    
    public void LimpiarMedicamentos(){
        this.medicamentos.clear();
    }
    
    public void EliminarMedicamento(int _medicamentoId){
        this.medicamentos.forEach((e) -> {
            if(e.getId() == _medicamentoId){
                this.medicamentos.remove(e);
            }
        });
    }
}
