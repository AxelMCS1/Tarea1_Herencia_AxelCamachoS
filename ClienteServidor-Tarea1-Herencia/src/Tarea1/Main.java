/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author axelc
 */
public class Main {
    public static void main(String[] args) {
        
        bAutomovil auto = new bAutomovil("135322", "Honda", 2002, "4", "Rojo");
        auto.infoVehiculo();
        
        cAutoPasajeros autoPasajeros = new cAutoPasajeros("3423","Kassadin", 2005, "2","Azul","4","Taxi" );
        autoPasajeros.infoVehiculo();
        
        bCamion camion = new bCamion("ADC0", "Toyota", 2015);
        camion.setRuedas(8);
        camion.infoVehiculo();
        
        cCamionCarga camionCarga = new cCamionCarga("WQR2323", "JohnDeer", 2010, 6, "250kg");
        camionCarga.setRuedas(6);
        camionCarga.infoVehiculo();
        
        
        bMoto moto = new bMoto("46168", "Kawasaki", 2022 , "500cc");
        moto.infoVehiculo();
        
        cMotoMonte motoMonte = new cMotoMonte("GDSDG", "Izuzu", 2007,"250cc", " ");
        motoMonte.setChasis("Oxidado");
        motoMonte.infoVehiculo();
        
        cMotoAgua motoAgua = new cMotoAgua("777", "Ferrari", 2023, "100cc", "162cm");
        motoAgua.infoVehiculo();
    }
}
