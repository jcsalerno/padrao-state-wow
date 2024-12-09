package org.example;

public class Main {
    public static void main(String[] args) {
        Druida druida = new Druida();

        // Muda para a forma de Tank
        druida.definirForma(new FormaTank());
        System.out.println(druida.realizarAcao());


        // Muda para a forma de DPS
        druida.definirForma(new FormaDps());
        System.out.println(druida.realizarAcao());

        // Muda para a forma de Healer
        druida.definirForma(new FormaHealer());
        System.out.println(druida.realizarAcao());
    }
}