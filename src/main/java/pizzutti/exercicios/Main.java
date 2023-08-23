package pizzutti.exercicios;

import pizzutti.exercicios.model.Conta;
import pizzutti.exercicios.model.Data;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setNomeTitular("Ana");
        conta1.setSaldo(100);

        Conta conta2 = new Conta();
        conta2.setNomeTitular("Ana");
        conta2.setSaldo(100);

        if (conta1 == conta2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes"); //vai cair aqui
        }

        conta2 = conta1;

        if (conta1 == conta2) {
            System.out.println("iguais"); //vai cair aqui
        } else {
            System.out.println("diferentes");
        }

        Conta conta3 = new Conta();
        conta3.setNomeTitular("Maria");
        conta3.setNumero(1);
        conta3.setAgencia("1234");
        conta3.setSaldo(200);
        conta3.setDataAbertura(new Data(3, 5,2015));

        System.out.println(conta3.recuperaDadosParaImpressao());

    }
}