
package com.mycompany.atividade_aprovado;

public class Teste {

    public static void main(String[] args) {
        
        ProvaUCB prova_ucb = new ProvaUCB(2,2);
        ProvaFafifo prova_fafifo = new ProvaFafifo(6,7);
        
        prova_fafifo.aprovado();
        prova_ucb.aprovado();
        
    }
}
