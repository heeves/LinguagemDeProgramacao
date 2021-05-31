package Semana4_ImplementacaoDeClasses;
public class Bug {
    /** Representa o ponto inicial da reta */
    private double PontoInicial;
    /** Representa a posição do bug */
    private double Posicao;
    /** Representa o ponto final da reta */
    private double PontoFinal;
    /** Representa o movimento do bug */
    private double Move;
    /**
     * Constrói uma linha que vai de 0 até 100, com um bug no ínicio da linha que percorre essa linha
     */
    public Bug(){
        PontoInicial = 0;
        Posicao = 0;
        PontoFinal = 100;
        Move = 0;
    }
    /**
     * Mostra a posição do bug na linha
     * @return posição do bug
     */
     public double getPosicao(){
        return Posicao; 
   }
   /**
    * Mostra o bug se mexendo
    * @return a nova posição em que o bug estará 
    */  
   public double Andar(){
       if(Move < PontoFinal){
           for(Move=0;Move<PontoFinal;Move++){
               Posicao = Move;
           }    
       }
       else if(Move < PontoInicial)
           Posicao--;
       return Posicao;
   } 
}
