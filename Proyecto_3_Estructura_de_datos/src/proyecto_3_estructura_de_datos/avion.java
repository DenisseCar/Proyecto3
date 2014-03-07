

package proyecto_3_estructura_de_datos;

/**
 *
 * @author mike
 */
public class avion {
   public double precio;
  public  String aerolinea;
    
    avion(String x, double y){
        precio=y;
        aerolinea=x;
    }
    
   @Override
    public String toString(){
        return Double.toString(precio);
    }
    
    
}//fin de la clase
