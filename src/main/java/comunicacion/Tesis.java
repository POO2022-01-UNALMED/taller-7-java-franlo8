package comunicacion;

public class Tesis extends Escrito{
    private String idea ;
    public static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public int palabrasTotales(int palabraspaginas){
        return palabraspaginas*5*this.getPaginas();
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String letra) {
        this.idea = letra;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
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
        super(origen, titulo, autor, paginas);
        this.idea = letra;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }
    public String toString(){
        String p = this.getOrigen()+"\n" + this.getTitulo()+"\n" + getAutor()+"\n" + getPaginas()+"\n"+ this.idea+"\n"+ this.argumentos.length+"\n"+this.conclusion+"\n"+ this.referencias;
        return p;

    }
}
