
package tareaprog;
import java.util.ArrayList;
import java.util.Date;

class Articulo {
    private final float peso;
    private final String nombre;
    private final String descripcion;
    private final float precio;
    public Articulo(float p, String n, String d, float pr){
        peso = p;
        nombre = n;
        descripcion = d;
        precio = pr;
    }
    public float getPrecio(){
        return precio;
    }
    public float getPeso(){
        return peso;
    }
}

class DetalleOrden {
    private final ArrayList<Articulo> a;
    private int cantidad;
    public DetalleOrden(){
        a = new ArrayList<>();
    }
    public void addArticulo(Articulo x){
        a.add(x);
    }
    public float calcPrecio(){
        float precioTotal = 0;
        for(int i = 0; i<a.size(); i++){
            precioTotal += a.get(i).getPrecio();
        }
        return precioTotal;
    }
    public float calcPrecioSinIva(){
        float precioTotal = 0;
        for(int i = 0; i<a.size(); i++){
            precioTotal += a.get(i).getPrecio()/1.19;
        }
        return precioTotal;
    }
    public float calcIVA(){
        float IVAtotal = 0;
        for(int i = 0; i<a.size(); i++){
            IVAtotal += a.get(i).getPrecio()*0.19;
        }
        return IVAtotal;
    }
    public float calcPeso(){
        float pesoTotal = 0;
        for(int i = 0; i<a.size(); i++){
            pesoTotal += a.get(i).getPeso();
        }
        return pesoTotal;
    }
}

public class TareaProg {

    public static void main(String[] args) {

    }
    
}
