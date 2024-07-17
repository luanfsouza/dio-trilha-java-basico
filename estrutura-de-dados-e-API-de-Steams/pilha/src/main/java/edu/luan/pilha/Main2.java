package edu.luan.pilha;

public class Main2 {
    public static void main(String[] args) {

        Piilha2 novaPiilha2 = new Piilha2();
        
        novaPiilha2.push(new No2(1));
        novaPiilha2.push(new No2(2));
        novaPiilha2.push(new No2(4));
        novaPiilha2.push(new No2(5));
        System.out.println(novaPiilha2);

        System.out.println(novaPiilha2.top());
        
        novaPiilha2.pop();
        System.out.println(novaPiilha2);
        
    }
}
