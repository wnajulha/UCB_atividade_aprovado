
package com.mycompany.atividade_aprovado;


public class ProvaUCB extends ProvaUniversidade{
    
    private boolean aprovado;
    
    public ProvaUCB(double AV1, double AV2) {
        super(AV1, AV2);
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
    public void aprovado(){
        if(calcularMedia() >= 7){
            this.setAprovado(true);
            System.out.println("O aluno esta aprovado");
        }else{
            this.setAprovado(false);
            System.out.println("O aluno esta reprovado");
        }
        
        
    }
    
}
