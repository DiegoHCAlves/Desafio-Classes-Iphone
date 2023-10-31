package com.meuApp;

import com.modelos.Iphone1;
import com.modelos.Iphone2;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone1 iphone1 = new Iphone1();

        System.out.println();
        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica();
        iphone1.exibirPagina();
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
        iphone1.ligar();
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");

        Iphone2 iphone2 = new Iphone2();

        System.out.println();
        iphone2.tocar();
        iphone2.pausar();
        iphone2.selecionarMusica();
        iphone2.exibirPagina();
        iphone2.adicionarNovaAba();
        iphone2.atualizarPagina();
        iphone2.ligar();
        iphone2.atender();
        iphone2.iniciarCorreioVoz();

    }
}
