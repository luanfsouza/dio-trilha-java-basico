package edu.luan.pilha;

public class Piilha2 {
    private No2 referenciaAoNoEntradaNaPilha;

    public Piilha2() {
        this.referenciaAoNoEntradaNaPilha = null;
    }
    public void push(No2 novoNo2){
        No2 noAuxiliar = referenciaAoNoEntradaNaPilha;
        referenciaAoNoEntradaNaPilha = novoNo2;
        referenciaAoNoEntradaNaPilha.setReferenciaNo(noAuxiliar);
    }

    public boolean isEmpity(){
        return referenciaAoNoEntradaNaPilha == null ? true : false;
    }
    
    public No2 top(){
        return referenciaAoNoEntradaNaPilha;
    }
    public No2 pop(){
        
        if(!isEmpity()){
            No2 popedNo = referenciaAoNoEntradaNaPilha;
            referenciaAoNoEntradaNaPilha = referenciaAoNoEntradaNaPilha.getReferenciaNo();
            return popedNo;
        }
        return null;
        
    }
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "--------------\n";
    
        No2 noAuxiliar = referenciaAoNoEntradaNaPilha;
    
        while (true) {
            if(noAuxiliar != null){
                stringRetorno += "[No{dado="+ noAuxiliar.getConteudo()+"}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }else{
                break;
            }
        }
        stringRetorno += "--------------\n";
        return stringRetorno;
    }
}
