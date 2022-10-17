public class Partidas {
    private Rodadas numRodadas;
    private Time timeVisitante;
    private Time timeMandante;
    private int golMandantes;
    private int golVisitantes;
    private int golMandApost;
    private int golVistApost;
    private int vencendor;
    private int pontoTemporario;   
    
   
    Apostadores apostadores = new Apostadores();
    public String golMandApost(){
        golMandApost = apostadores.getGolApostaMand();
        return golMandApost();
    }
    
    
    public String golVistApost(){
        golVistApost = apostadores.getGolApostaVist();
        return golVistApost();
    }   
    
    //metodo para contabilizar os pontos 
    /**
     * 
     */
    public void metodoPontos(){
        if(golMandApost == getGolMandantes()){
            if(golVistApost == getGolVisitantes()){
                pontoTemporario = 10;
            }
            else{
                pontoTemporario = 2;
            }
        else if(golVistApost == getGolVisitantes()){
            pontoTemporario +=2;
        }
        }
    }
    































    /*GETTERS AND SETTERS
    ==================*/


    public Rodadas getNumRodadas() {
        return this.numRodadas;
    }

    public void setNumRodadas(Rodadas numRodadas) {
        this.numRodadas = numRodadas;
    }

    public Time getTimeVisitante() {
        return this.timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Time getTimeMandante() {
        return this.timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public int getGolMandantes() {
        return this.golMandantes;
    }

    public void setGolMandantes(int golMandantes) {
        this.golMandantes = golMandantes;
    }

    public int getGolVisitantes() {
        return this.golVisitantes;
    }

    public void setGolVisitantes(int golVisitantes) {
        this.golVisitantes = golVisitantes;
    }


    public int getGolMandApost() {
        return this.golMandApost;
    }

    public void setGolMandApost(int golMandApost) {
        this.golMandApost = golMandApost;
    }

    public int getGolVistApost() {
        return this.golVistApost;
    }

    public void setGolVistApost(int golVistApost) {
        this.golVistApost = golVistApost;
    }

    public int getVencendor() {
        return this.vencendor;
    }

    public void setVencendor(int vencendor) {
        this.vencendor = vencendor;
    }

    public Apostadores getApostador() {
        return this.apostador;
    }

    public void setApostador(Apostadores apostador) {
        this.apostador = apostador;
    }

    public int getPontoTemporario() {
        return this.pontoTemporario;
    }

    public void setPontoTemporario(int pontoTemporario) {
        this.pontoTemporario = pontoTemporario;
    }

    public Apostadores getApostadores() {
        return this.apostadores;
    }

    public void setApostadores(Apostadores apostadores) {
        this.apostadores = apostadores;
    }

   
}
