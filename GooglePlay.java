import java.util.ArrayList;
/**
 * Write a description of class Tienda here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    ArrayList<Usuario> Usuarios; 
    ArrayList<Producto> Productos; 

    /**
     * Constructor for objects of class Tienda
     */
    public GooglePlay()
    {
        Productos = new ArrayList<Producto>();
        Usuarios = new ArrayList<Usuario>();

    }

    /**
     * Metodo que nos permite obtener el numero de usuarios que tenemos registrados en nuestra tienda
     */
    public int getNumeroUsuarios()
    {
        int numeroDeUsuarios = 0;
        numeroDeUsuarios = Usuarios.size();

        return numeroDeUsuarios;
    }

    /**
     * Mtodo que nos permite añadir un usuario a nuestra tienda
     */
    public void addUsuario(Usuario usuarioAAniadir)
    {
        Usuarios.add(usuarioAAniadir);
    }

    /**
     * Metodo qeu nos permite añadir un producto a nuesta tienda
     */
    public void addProducto(Producto productoAAniadir)
    {
        Productos.add(productoAAniadir);
    }

    /**
     * Meotodo que nos devuelde el numero de productos que hay en nuestra tienda
     */
    public int getNumeroProductos()
    {
        int numeroDeProductos = 0;
        numeroDeProductos = Productos.size();

        return numeroDeProductos;

    }

    public int comprar(String usuarioQueCompra, String productoAComprar)
    {
        int importeCompra = -1;
        boolean usuario = false;
        boolean producto = false;
         boolean buscando = true;
        
        for (int contador = 0; contador < Usuarios.size(); contador++)
        {
            if (Usuarios.get(contador).getNombreCuenta() == usuarioQueCompra && buscando)
            {
                usuario = true;
                buscando = false;
                
            }
        }
        
        for (int contador = 0; contador < Productos.size(); contador++)
        {
            if(Productos.get(contador).getNombreProducto() == productoAComprar && buscando)
            {
                 producto = true;
                 buscando = false;
            }
        }
        return importeCompra;
       
        
    

    
    }

}
