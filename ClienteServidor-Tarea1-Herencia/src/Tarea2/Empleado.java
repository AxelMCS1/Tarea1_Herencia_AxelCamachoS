/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author axelc
 */
public class Empleado extends Persona implements buscarEmpleado{

    public Empleado(int id, int edad, int nombre) {
        super(id, edad, nombre);
    }
    private String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    

    @Override
    public int buscar(int id) {
        return id;
    }
    
    
}
