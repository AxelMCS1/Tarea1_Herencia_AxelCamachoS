/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author axelc
 */
public class Proovedor extends Persona implements buscarEmpleado{

    public Proovedor(int id, int edad, int nombre) {
        super(id, edad, nombre);
    }
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    @Override
    public int buscar(int id) {
        return id;
    }
    
    public String tipoEmpleo(){
    return tipo;
    }
}
