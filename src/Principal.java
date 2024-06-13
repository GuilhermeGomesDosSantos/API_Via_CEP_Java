/*
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaCEP newCep = new ConsultaCEP();
        Scanner leitrua = new Scanner(System.in);

        System.out.println("Informe o N° do CEP:");
        var cep = leitrua.nextLine();

        try {
            Endereco novoEndereco = newCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
*/

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaCEP newCep = new ConsultaCEP();
        Scanner leitura = new Scanner(System.in);
        String cep;

        do {
            System.out.println("Informe o N° do CEP:");
            cep = leitura.nextLine();

            try {
                if (cep.length() != 8) {
                    System.out.println("CEP inválido. O CEP deve ter 8 dígitos.");
                    continue; // Pula para a próxima iteração do loop
                }

                Endereco novoEndereco = newCep.buscaEndereco(cep);
                System.out.println(novoEndereco);
                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.salvaJson(novoEndereco);

            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        } while (cep.length() != 8);

        System.out.println("Finalizando a aplicação");
        leitura.close();
    }
}
