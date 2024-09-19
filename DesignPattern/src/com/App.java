package com;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

 {
        System.out.println("Selecione seu combo:");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt(); 

        Combo combo = new Combo();
        combo.criarCombo(tipo);

        System.out.println(combo.getDescricaoCombo());
        
    }
}
}
