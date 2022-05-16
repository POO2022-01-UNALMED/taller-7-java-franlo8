package comunicacion;

public class Tesis extends Escrito{
    private String letra ;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public int palabrasTotales(int ){

    }

    public String interpretacion(){

    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Tesis (String origen, String titulo, String autor, int paginas, String letra, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(Escrito);
        this.letra = letra;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }
}
