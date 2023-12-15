package br.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.classe.Pessoa;


public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");

        // Lista para armazenar os nomes
        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break; // Encerra a entrada quando o usuário digitar "fim"
            }

            separarGrupo(nome);
        }

        scanner.close();
    }

    private static void separarGrupo(String nome) {
        // Use o método split para dividir o nome com base no caractere "-"
        String[] partesDoNome = nome.split("-");

        if (partesDoNome.length > 1) {
            String ultimoTrecho = partesDoNome[partesDoNome.length - 1];

            if (ultimoTrecho.equalsIgnoreCase("M")) {
                System.out.println("Grupo Masculino: " + nome);
            } else if (ultimoTrecho.equalsIgnoreCase("F")) {
                System.out.println("Grupo Feminino: " + nome);
            } else {
                System.out.println("Formato inválido para gênero: " + nome);
            }
        } else {
            System.out.println("Formato inválido: " + nome);
        }
    }
}