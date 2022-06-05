/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class bCamion extends aVehiculo{
    
    private int Ruedas;

    public bCamion(String Placa, String Marca, int Modelo) {
        super(Placa, Marca, Modelo);
        
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }
    
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() +" Cantidad de ruedas: "+ this.Ruedas);
    }
    
}
