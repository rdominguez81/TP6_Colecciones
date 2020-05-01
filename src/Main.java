
import java.util.Iterator;
import java.util.Set;

public class Main 
{
    public static void main(String[] args)
    {
        Directorio directorio = new Directorio();
        Directorio directorio2 = new Directorio(); //DIRECTORIO VACIO PARA PROBAR ITERACIONES
        
        String ciudad1 = "San Luis Capital";
        String ciudad2 = "Villa Mercedes";
        String ciudad3 = "Merlo";
        
        long telefono1 = 154111;
        long telefono2 = 154222;
        long telefono3 = 154333;
        long telefono4 = 154444;
        
        Cliente cliente1 = new Cliente(28816741,"Rodrigo","Dominguez",ciudad1,"Martin Guemes");
        Cliente cliente2 = new Cliente(26711386,"Laura","Garcia",ciudad1,"Martin Guemes");
        Cliente cliente3 = new Cliente(12345678,"José","Bataglia",ciudad2,"Pedernera 1580");
        Cliente cliente4 = new Cliente(87654321,"Viviana","Gomez",ciudad2,"Colon 1325"); //CLIENTE SIN CARGAR PARA PROBAR
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////agregarCliente");
        System.out.println("");
        
        directorio.agregarCliente(telefono1, cliente1);
        directorio.agregarCliente(telefono2, cliente2);
        directorio.agregarCliente(telefono3, cliente1);
        directorio.agregarCliente(telefono4, cliente3);
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////buscarCliente");
        System.out.println("");
        
        for(long k = 154110;k <= 154112;k ++)
        {
            if(directorio.buscarCliente(k) != null)
            {
                System.out.println("Teléfono: "+k+" -> "+directorio.buscarCliente(k).getNombreApellido());
            }
            else
            {
                System.out.println("El teléfono "+k+" no existe en el Directorio!");
            }
        }
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////buscarTelefono");
        System.out.println("");
        
        if(!directorio.directorioVacio())
        {
            Iterator it = directorio.buscarTelefono(cliente1.getApellido()).iterator();
        
            System.out.println("Telefono/s de: "+cliente1.getApellido());
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        else
        {
            System.out.println("DIRECTORIO VACIO!");
        }
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////borrarCliente");
        System.out.println("");
        
        if(directorio.borrarCliente(cliente1.getDni()))
        {
            System.out.println("Se eliminó de forma correcta el cliente con DNI "+cliente1.getDni());
        }
        else
        {
            System.out.println("El cliente con DNI "+cliente1.getDni()+" no se encontraba en el Directorio");
        }
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////buscarClientes");
        System.out.println("");
        
        if(!directorio.directorioVacio())
        {
            Iterator it2 = directorio.buscarClientes(ciudad1).iterator();
        
            System.out.println("Clientes de la ciudad "+ciudad1);
            while(it2.hasNext())
            {
                System.out.println(it2.next());
            }
        }
        else
        {
             System.out.println("DIRECTORIO VACIO!");
        }
    }
}
