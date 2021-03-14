/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatos9;

/**
 *
 * @author miguel
 */
public class ExpressaoRegular {
    public String BRANCO,BRANCOS,REAL,DIA,MES,DATA;
    public String DIGITO,DIGITOS,FRACAO;
    public String LETRA,LETRAS,QUANTIDADEPARDEA,VARIAVEL,INTEIRO,EXPONENCIAL,VETOR;
    public ExpressaoRegular(){
        BRANCO="(\\s)";
        BRANCOS=BRANCO+"*";
        
        DIGITO="([0-9])";
        DIGITOS="("+DIGITO+"*)";
        
        LETRA="([A-Za-z])";
        LETRAS="("+LETRA+"*)";
        
        VARIAVEL="("+LETRA+"("+LETRA+"|"+DIGITO+")*)";
        VETOR= VARIAVEL+"\\[("+VARIAVEL+"|"+DIGITOS+")\\]";
        INTEIRO="((-?|\\+?)"+DIGITOS+")";
        
        EXPONENCIAL="(E(-?|\\+?)"+DIGITOS+")";
        FRACAO="(\\."+DIGITOS+")";
        REAL="("+DIGITOS+FRACAO+"?"+EXPONENCIAL+"?)";
        
        DIA="([1-5])";
        MES="([1-9]|10|11|12)";
        DATA=DIA+"\\/"+MES+"\\/"+DIGITOS+"*";
    }
    public void confere(String exp,String sentenca){
        if((sentenca!=null)&&!sentenca.isEmpty()){
            if (sentenca.matches(exp)){
                System.out.println("W:'"+sentenca+"'ACEITA!");
            }else{
                System.err.println("W:'"+sentenca+"'rejeitada!");
            }
        }else{
            System.err.println("sentença vazia");
        }
    }
}
