/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author axelc
 */
public class Main {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado(20,30,40);
        empleado.buscar(20);
        
        Cliente cliente = new Cliente(50,"Semanal");
        cliente.tipoEmpleo();
    }
}
