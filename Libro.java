
/**
 * Write a description of class Libro here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{

    private int numeroPaginas;
    private boolean cienciaFiccion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombre, int anio, int numeroPaginas, boolean cienciaFiccion)
    {
        super(nombre, anio);
        this.numeroPaginas = numeroPaginas;
        this.cienciaFiccion = cienciaFiccion;

    }

   
    /**
     * Metodo que devuelve el numero de paginas de nuestro libo
     */
    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    /**
     * Metodo que devuelve true en caso de que la pelicula sea de ciencia ficcion y false en caso contrario
     */
    public boolean getFiccion()
    {
        return cienciaFiccion;
    }
    
    public double getPrecio()
    {
        double precio = 0.0;
        return precio;
        
    }
}
