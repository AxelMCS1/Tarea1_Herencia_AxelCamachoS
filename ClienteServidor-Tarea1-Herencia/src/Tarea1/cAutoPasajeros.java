/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class cAutoPasajeros extends bAutomovil {
    
    private String Asientos;
    private String Utilidad;
    
    public cAutoPasajeros(String Placa, String Marca, int Modelo, String Puertas, 
            String Color, String Asientos, String Utilidad){
    
        super(Placa, Marca, Modelo, Puertas, Color);
        
        this.Asientos = Asientos;
        this.Utilidad = Utilidad;
    }

    public String getAsientos() {
        return Asientos;
    }

    public void setAsientos(String Asientos) {
        this.Asientos = Asientos;
    }

    public String getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(String Utilidad) {
        this.Utilidad = Utilidad;
    }
    
    @Override
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() + " Puertas: "+ super.getPuertas() + " Color: " + super.getColor() +
                "Asientos: " + this.Asientos + "Utilidad: " + this.Utilidad);
    }
}
