
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Directorio 
{
    private TreeMap<Long,Cliente> directorio = new TreeMap<>();
    
    public void agregarCliente(long telefono, Cliente cliente)
    {   
        if(directorio.put(telefono, cliente) == null)
        {
            System.out.println("El cliente "+cliente.getNombre()+" "+cliente.getApellido()+" con el teléfono "+telefono+" fue insertado con éxito en el Directorio!");
        }
        else
        {
            System.out.println("El teléfono ingresado ya existe en el directorio!");
        }
    }
    
    public Cliente buscarCliente(long telefono)
    {
        return directorio.get(telefono);
    }
    
    public Set<Long> buscarTelefono(String apellido)
    {
        Set<Long> directorio_temp = this.directorio.keySet();
        HashSet<Long> telefonos = new HashSet<>();
        
        Iterator it = directorio_temp.iterator();
        
        long telefono = 0;
        
        while(it.hasNext())
        {
            telefono = (Long)it.next();
            
            Cliente cliente = this.directorio.get(telefono);
            
            if(cliente.getApellido().equals(apellido))
            {
                telefonos.add(telefono);
            }
        }
        
        return telefonos;
    }
    
    public HashSet<String> buscarClientes(String ciudad)
    {
        Set<Long> clientes_temp = this.directorio.keySet();
        HashSet<String> clientes = new HashSet<>();
        
        Iterator it = clientes_temp.iterator();
        
        long telefono = 0;
        
        while(it.hasNext())
        {
            telefono = (Long)it.next();
            
            Cliente cliente = this.directorio.get(telefono);
            
            if(cliente.getCiudad().equals(ciudad))
            {
                clientes.add(cliente.getNombreApellido());
            }
        }
        
        return clientes;        
    }
    
    public boolean borrarCliente(long dni)
    {
        boolean control = false;
        
        Set<Long> clientes_temp = this.directorio.keySet();
        
        Iterator it = clientes_temp.iterator();
        
        long telefono = 0;
        
        while(it.hasNext())
        {
            telefono = (Long)it.next();
            
            Cliente cliente = this.directorio.get(telefono);
            
            if(cliente.getDni() == dni)
            {
                it.remove();
                control = true;
            }
        }
        
        return control;
    }
    
    public boolean directorioVacio()
    {
        return this.directorio.isEmpty();
    }
}
