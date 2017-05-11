
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
    public Pelicula(String nombre, int anio, int duracion, int calidad)
    {
       super(nombre, anio);
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
    
    @Override
    public double getPrecio()
    {
        double precio = 0;

        if(calidad == 1080 ){
            precio = 10;
            if(getAno() < 2000){
                precio = precio - (precio * 0.5);
            }
        }
        else if (calidad == 480){
            precio = 5;
            if(getAno() < 2000){
                precio = precio - (precio * 0.5);
            }
        }
        return precio;
    }

}
