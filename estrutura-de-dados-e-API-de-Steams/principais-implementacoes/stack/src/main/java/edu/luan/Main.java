package edu.luan;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();
        
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Cheyrolet"));
        stackCarros.push(new Carro("Fielt"));
        System.out.println(stackCarros);
        
        stackCarros.pop();
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.isEmpty());
    }
}