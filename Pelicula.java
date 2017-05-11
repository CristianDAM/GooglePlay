
/**
 * Write a description of class Pelicula here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
  
    private int duracion;
    private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int anio, int duracion, int calidad)
    {
       super(titulo, anio);
        this.duracion = duracion;
        if (calidad == 1080 || calidad == 480){ 
            this.calidad = calidad;
        }
    }

 
    /**
     * Metodo que devuelve la duracion de la pelicula
     */
    public int getDuracion()
    {
        return duracion;
    }
    
    /**
     * Metodo que devuelve en un String la calidad de una pelicula
     */
    public String getCalidad()
    {
        String calidadPelicula = "";
        if (calidad == 1080){
            calidadPelicula = "FullHD";
        }
        else {
            calidadPelicula = "HD";
        }
        return calidadPelicula;
    }

}
