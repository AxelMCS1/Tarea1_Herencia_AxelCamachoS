/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class cMotoAgua extends bMoto{
    
    private String Tamano;

    public cMotoAgua(String Placa, String Marca, int Modelo, String Cilindro, String Tamano) {
        super(Placa, Marca, Modelo, Cilindro);
        this.Tamano = Tamano;
    }
    @Override
    public void infoVehiculo(){
    
        System.out.println("Placa: " + super.getPlaca() +
                " Marca: " + super.getMarca() +
                " Modelo: " + super.getModelo() + " Cilindraje: " + super.getCilindro() + " Tamaño: " + this.Tamano);
    }
}
