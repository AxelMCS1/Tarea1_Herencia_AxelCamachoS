/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class bMoto extends aVehiculo{
    
    private String Cilindro;

    public bMoto(String Placa, String Marca, int Modelo,String Cilindro) {
        super(Placa, Marca, Modelo);
        this.Cilindro = Cilindro;
    }

    public String getCilindro() {
        return Cilindro;
    }

    public void setCilindro(String Cilindro) {
        this.Cilindro = Cilindro;
    }
    
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() + " Cilindraje: " + this.Cilindro);
    }
}
