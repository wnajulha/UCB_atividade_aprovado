/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_aprovado;

/**
 *
 * @author anajulia.pereira
 */
public class ProvaFafifo extends ProvaUniversidade{
    
    private boolean aprovado;
    
    public ProvaFafifo(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
    
    public void aprovado(){
        if(calcularMedia() >= 6){
            this.setAprovado(true);
            System.out.println("O aluno esta aprovado");
        }else{
           this.setAprovado(false);
           System.out.println("O aluno esta reprovado");
        }
    }
}
        
    
    
    

