/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdd;

public class Vehiculo {
    public int id;
    public String placa;
    public String cpn;
    public String chasis;
    public String nombre;
    public String apellido;
    
    public int resultado;
    
    public Vehiculo(int resultado) {
        this.resultado = resultado;
        
    }
    
    public Vehiculo(int id, String placa, String cpn, String chasis, String nombre, String apellido, int resultado) {
        this.id = id;
        this.placa = placa;
        this.cpn = cpn;
        this.chasis = chasis;
        this.nombre = nombre;
        this.apellido = apellido;
        this.resultado = resultado;
    }
}
