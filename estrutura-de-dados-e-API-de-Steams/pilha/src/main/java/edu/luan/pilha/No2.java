package edu.luan.pilha;

public class No2 {
private Integer conteudo;
private No2 referenciaNo;

public No2(Integer conteudo){
    this.conteudo = conteudo;
    
}

public Integer getConteudo() {
    return conteudo;
}

public void setConteudo(Integer conteudo) {
    this.conteudo = conteudo;
}

public No2 getReferenciaNo() {
    return referenciaNo;
}

public void setReferenciaNo(No2 referenciaNo){
    this.referenciaNo = referenciaNo;
}
public String toString(){
    return conteudo.toString();
}

}
