/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class cCamionCarga extends bCamion{
    
    private String Peso;

    public cCamionCarga(String Placa, String Marca, int Modelo, int Ruedas, String Peso) {
        super(Placa, Marca, Modelo);
        this.Peso = Peso;
    }

    
    @Override
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() +" Cantidad de ruedas: "+ super.getRuedas() + " Peso: " + this.Peso);
    }
    
}
