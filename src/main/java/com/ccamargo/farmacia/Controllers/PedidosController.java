/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccamargo.farmacia.Controllers;
import com.ccamargo.farmacia.Models.DistribuidorModel;
import com.ccamargo.farmacia.Models.SucursalModel;
import com.ccamargo.farmacia.Models.MedicamentoModel;
import com.ccamargo.farmacia.Models.PedidoDetalleModel;
import com.ccamargo.farmacia.Models.PedidoEncabezadoModel;
import com.ccamargo.farmacia.Models.TipoMedicamentoModel;
import java.util.ArrayList;
/**
 *
 * @author Carlos Camargo
 */
public class PedidosController {
    
    public ArrayList<SucursalModel> sucursal;
    public ArrayList<DistribuidorModel> distribuidor;
    public MedicamentoModel medicamento;
    public ArrayList<TipoMedicamentoModel> tipoMedicamento;
    public ArrayList<PedidoDetalleModel> pedidoDetalle;
    public ArrayList<PedidoEncabezadoModel> pedidoEncabezado;
    
    public PedidosController(){
        this.tipoMedicamento = new ArrayList<>();
        this.sucursal = new ArrayList<>(); 
        this.distribuidor = new ArrayList<>();
        this.pedidoEncabezado = new ArrayList<>();
        this.pedidoDetalle = new ArrayList<>();
        this.CrearDatos();
    }
    
    private void CrearDatos() {
        TipoMedicamentoModel analgesico = new TipoMedicamentoModel(1,"Analgésico");
        TipoMedicamentoModel analeptico = new TipoMedicamentoModel(2,"Analéptico");
        TipoMedicamentoModel anestesico = new TipoMedicamentoModel(3,"Anestésico");
        TipoMedicamentoModel antiacido = new TipoMedicamentoModel(4,"Antiácido");
        TipoMedicamentoModel antidepresivo = new TipoMedicamentoModel(5,"Antidepresivo");
        TipoMedicamentoModel antibioticos = new TipoMedicamentoModel(6,"Antibióticos");
    
        this.tipoMedicamento.add(analgesico);
        this.tipoMedicamento.add(analeptico);
        this.tipoMedicamento.add(anestesico);
        this.tipoMedicamento.add(antiacido);
        this.tipoMedicamento.add(antidepresivo);
        this.tipoMedicamento.add(antibioticos);
        
        DistribuidorModel confarma = new DistribuidorModel(1,"Confarma");
        DistribuidorModel empsephar = new DistribuidorModel(2,"Empsephar");
        DistribuidorModel cemefar = new DistribuidorModel(3,"Cemefar");
        
        this.distribuidor.add(confarma);
        this.distribuidor.add(empsephar);
        this.distribuidor.add(cemefar);
        
        SucursalModel principalConfarma = new SucursalModel(1,"Principal","Calle de la Rosa n. 28",confarma);
        SucursalModel secundariaConfarma = new SucursalModel(2,"Secundaria","Calle Alcazabilla n. 3",confarma);
        
        SucursalModel principalEmpsephar = new SucursalModel(3,"Principal","Calle de la Rosa n. 28",empsephar);
        SucursalModel secundariaEmpsephar = new SucursalModel(4,"Secundaria","Calle Alcazabilla n. 3",empsephar);
        
        SucursalModel principalCemefar = new SucursalModel(5,"Principal","Calle de la Rosa n. 28",cemefar);
        SucursalModel secundariaCemefar = new SucursalModel(6,"Secundaria","Calle Alcazabilla n. 3",cemefar);
        
        this.sucursal.add(principalConfarma);
        this.sucursal.add(secundariaConfarma);
        this.sucursal.add(principalEmpsephar);
        this.sucursal.add(secundariaEmpsephar);
        this.sucursal.add(principalCemefar);
        this.sucursal.add(secundariaCemefar);
    }
    
    public PedidoEncabezadoModel CrearEncabezadoPedido(SucursalModel sucursal){
        int idEncabezado = !this.pedidoEncabezado.isEmpty() ? this.pedidoEncabezado.size() + 1 : 1;
        PedidoEncabezadoModel obj = new PedidoEncabezadoModel(idEncabezado);
        obj.setSucursal(sucursal);
        this.pedidoEncabezado.add(obj);
        return obj;
    }
    
    public int CrearDetallePedido(PedidoEncabezadoModel encabezado, MedicamentoModel medicamento){
        int idDetalle = !this.pedidoDetalle.isEmpty() ? this.pedidoDetalle.size() + 1 : 1;
        PedidoDetalleModel obj = new PedidoDetalleModel(idDetalle);
        obj.setEncabezado(encabezado);
        obj.setMedicamentos(medicamento);
        this.pedidoDetalle.add(obj);
        return obj.getId();
    }
    
}
