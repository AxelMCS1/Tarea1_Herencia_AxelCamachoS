/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author axelc
 */
public class Cliente extends Tipo {

      private int compra;

    public Cliente(int compra, String tipo) {
        super(tipo);
        this.compra = compra;
    }
      
    
    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    @Override
    public String tipoEmpleo() {
          return "Nocturno";
    }
    
    
    
}
