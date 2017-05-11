
/**
 * Write a description of class Usuario here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Usuario
{
    
    private String email;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String email)
    {
        this.email = email;
    }
    
    /**
     * Metodo qeu devuelve el correo de nuestro usuario
     */
   public String getNombreCuenta()
   {
       return email;
    }
}
