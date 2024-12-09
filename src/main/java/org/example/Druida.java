package org.example;

import org.example.EstadoForma;

// Classe Druida que alterna entre os estados
class Druida {
    private EstadoForma forma;

    public void definirForma(EstadoForma forma) {
        this.forma = forma;
    }

    public String realizarAcao() {
        return forma.executarAcao();
    }
}
