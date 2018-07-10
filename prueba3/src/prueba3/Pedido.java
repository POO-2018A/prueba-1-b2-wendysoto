/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

/**
 *
 * @author ESFOT
 */
public class Pedido {
    
    Cliente cliente;
    
    Frutas fruta;

    public Pedido(Cliente cliente, Frutas fruta) {
        this.cliente = cliente;
        this.fruta = fruta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Frutas getFruta() {
        return fruta;
    }

    public void setFruta(Frutas fruta) {
        this.fruta = fruta;
    }
    
    
    
}
