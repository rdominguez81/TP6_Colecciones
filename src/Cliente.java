/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Cliente 
{
    private long dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Cliente(long dni, String nombre, String apellido, String ciudad, String direccion) 
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Cliente() 
    {
    }   

    public String getNombre() 
    {
        return nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public String getNombreApellido()
    {
        return this.nombre+" "+this.apellido;
    }

    public String getCiudad() 
    {
        return ciudad;
    }

    public long getDni() 
    {
        return dni;
    }  
     
}
