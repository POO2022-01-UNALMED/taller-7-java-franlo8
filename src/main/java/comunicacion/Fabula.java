package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza ;
    private String interpretacion ;

    public int palabrasTotales(int palabraspaginas ){
         return palabraspaginas*1;
    }

    public String interpretacion(){
           return "a";
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
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String toString(){
       String p = this.getOrigen()+"\n" + this.getTitulo()+"\n" + getAutor()+"\n" + getPaginas()+"\n"+ this.ensenanza;
       return p;
    }
}

