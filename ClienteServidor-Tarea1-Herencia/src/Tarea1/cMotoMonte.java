/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class cMotoMonte extends bMoto{
    
    private String Chasis;

    public cMotoMonte( String Placa, String Marca, int Modelo, String Cilindro, String Chasis) {
        super(Placa, Marca, Modelo, Cilindro);
        
    }

    public String getChasis() {
        return Chasis;
    }

    public void setChasis(String Chasis) {
        this.Chasis = Chasis;
    }
    @Override
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() + " Cilindraje: " + super.getCilindro() + " Chasis: " + this.Chasis);
    }
    
}
