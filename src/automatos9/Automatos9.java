/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatos9;

/**
 *
 * @author Caio
 */
public class Automatos9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpressaoRegular ER=new ExpressaoRegular();
        ER.confere(ER.DIGITOS, "00051120021");
        ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf");
        ER.confere(ER.DATA, "5/12/2019");
        ER.confere(ER.REAL, "4.51E21");
    }
    
}
