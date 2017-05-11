
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private String nombreAplicacion;
    private double espacioAplicacion;
    private Categoria tipoAplicacion;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion( String nombre, double espacio, Categoria tipo)
    {
     
        nombreAplicacion = nombre;
        espacioAplicacion = espacio;
        tipoAplicacion = tipo;

    }
    
    /**
     * Metodo que devuelde el nombre dla aplicacion
     */
    public String getNombre()
    {
        return nombreAplicacion;
    }

    /**
     * Metodo que devuelde el espacio en MB que ocupa nuestra aplicacion
     */
    public double getTamanoEnMB()
    {
        return espacioAplicacion;
    }

    /**
     * Metodo qeu devuelve el nombre de la categoria de nuestra aplicacion
     */
    public String getCategoria()
    {
        String nombreCategoria = "";
        switch (tipoAplicacion) {
            case MULTIMEDIA :
            nombreCategoria = "Multimedia";
            break;
            case COMUNICACIONES :
            nombreCategoria = "Comunicaciones";
            break;
            case JUEGOS :
            nombreCategoria = "Juegos";
            break;
            case PRODUCTIVIDAD :
            nombreCategoria = "Productividad";
            break;
        }
        return nombreCategoria;

    }

}
