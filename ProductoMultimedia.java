
/**
 * Write a description of class Producto here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class ProductoMultimedia extends Producto
{
    private String titulo;
    private int anio;


    /**
     * Constructor for objects of class Producto
     */
    public ProductoMultimedia(String titulo, int anio)
    {
     
        this.titulo = titulo;
        this.anio = anio;
     

    }
    
    /**
     * Metodo que devuelve el nombre de nuestro producto multimedia
     */
     public String getTitulo()
    {
        return titulo;
    }

    /**
     * Metodo que devuelve el año de creacon de nuestro producto multimedia
     */
    public int getAno()
    {
        return anio;
    }

}
