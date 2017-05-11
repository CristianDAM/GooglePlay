
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
 
    private double espacioAplicacion;
    private Categoria tipoAplicacion;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion( String nombre, double espacio, Categoria tipo)
    {
        super(nombre);
     
        espacioAplicacion = espacio;
        tipoAplicacion = tipo;

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
    
    @Override
    public double getPrecio()
    {
        double precio = 0.99;
        return precio;
    }

}
