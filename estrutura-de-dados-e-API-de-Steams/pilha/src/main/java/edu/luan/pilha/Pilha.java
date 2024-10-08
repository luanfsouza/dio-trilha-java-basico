package edu.luan.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }
    public No pop(){
        if(!this.isEmpity()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }
    public No top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpity(){
        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "--------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if(noAuxiliar != null){
                stringRetorno += "[No{dado="+ noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }else{
                break;
            }
        }
        stringRetorno += "--------------\n";
        return stringRetorno;
    }
    
}
