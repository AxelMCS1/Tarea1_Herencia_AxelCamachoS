/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class bAutomovil extends aVehiculo {
    
    private String Puertas;
    private String Color;
    
    public bAutomovil(String Placa, String Marca, int Modelo, String Puertas, String Color){
        super(Placa, Marca, Modelo);
        
        this.Puertas = Puertas;
        this.Color = Color;
        
    }

    public String getPuertas() {
        return Puertas;
    }

    public void setPuertas(String Puertas) {
        this.Puertas = Puertas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() + " Puertas: "+ this.Puertas + " Color: " + this.Color);
    }
    
}
