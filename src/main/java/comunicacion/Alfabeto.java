package comunicacion;

public class Alfabeto extends Pictograma {
    public static String[] letras;
    private String interpretacion;

    public int cantidadLetras() {

    }

    public String interpretacion() {
        return interpretacion;

    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Alfabeto (String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    String S = "";
    public String toString(){
        for (int i=0; i<letras.length; i++){
           if (i==)
        }
    }
}
