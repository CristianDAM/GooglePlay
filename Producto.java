
/**
 * Write a description of class Producto here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private String nombre;
    private int numeroVecesVendido; 

    private static final   int NUMERO_VECES_VENDIDO = 0;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
        numeroVecesVendido = NUMERO_VECES_VENDIDO;
    }

    /**
     * Metodo que devuelve el nombre del producto
     */
    public String getNombreProducto()
    {
        return nombre;
    }
    
    /**
     * Metodo abstracto de Producto
     */
    public abstract double getPrecio();
}
