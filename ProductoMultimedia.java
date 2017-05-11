
/**
 * Write a description of class Producto here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public  abstract class ProductoMultimedia extends Producto
{
   
    private int anio;
    


    /**
     * Constructor for objects of class Producto
     */
    public ProductoMultimedia(String nombre, int anio)
    {
        super(nombre);
     
        this.anio = anio;
     

    }
    
   

    /**
     * Metodo que devuelve el año de creacon de nuestro producto multimedia
     */
    public int getAno()
    {
        return anio;
    }

}
