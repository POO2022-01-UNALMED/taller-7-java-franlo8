package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza ;
    private String interpretacion ;

    public int palabrasTotales(int ){

    }

    public String interpretacion(){

    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Fabula (String origen, String titulo, String autor, int paginas, String ensenanza,  String interpretacion){
        super(Escrito);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
}

