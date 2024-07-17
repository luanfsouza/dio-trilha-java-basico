package edu.luan.java_atribuicao_referencia;



public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("int A = "+a+" int B = "+b);
        a = 3;
        System.out.println("int A = "+a+" int B = "+b);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objeto A = "+objA.toString()+" objeto B = "+objB.toString());
        objA.setNum(3);;
        System.out.println("objeto A = "+objA.toString()+" objeto B = "+objB.toString());
    }
}