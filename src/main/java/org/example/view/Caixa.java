package org.example.view;

import java.time.LocalDate;
import java.util.Scanner;
import org.example.Model.Cliente;

public class Caixa {
    Scanner input = new Scanner(System.in);

    public int menu(){
        System.out.println("\n=================================================");
        System.out.println("|                  BDB Bank                      |");
        System.out.println("| 1 - Cadastrar Conta                            |");
        System.out.println("| 2 - Listar Contas                              |");
        System.out.println("| 3 - Depositar                                  |");
        System.out.println("| 4 - Sacar                                      |");
        System.out.println("| 5 - Transferir                                 |");
        System.out.println("|                                                |");
        System.out.println("|                                       0 - Sair |");
        System.out.println("\n=================================================");

        System.out.print("Escolha: ");
        int opcao = input.nextInt();

        return opcao;
    }

    public Cliente cadastrarCliente(){
        System.out.print("| Nome do cliente: ");
        String nome = input.nextLine();

        System.out.print("| CPF: ");
        String cpf = input.nextLine();

        System.out.print("| Endereço: ");
        String endereco = input.nextLine();

        System.out.print("| Telefone: ");
        String telefone = input.nextLine();

        System.out.print("| Email: ");
        String email = input.nextLine();

        System.out.print("| Data de nascimento (AAAA-MM-DD): ");
        String dataStr = input.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataStr);

        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email, dataNascimento);

        return cliente;
    }

    public int escolhaTipoDeConta(){
        System.out.print("Tipo: \n| 1-Corrente \n| 2-Poupança ");
        int tipo = input.nextInt();

        return  tipo;
    }

    public String cadastrarNumeroConta(){
        System.out.print("Número da conta: ");
        String numero = input.nextLine();

        return numero;
    }

    public double cadastrarSaldo(){
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();

        return saldo;
    }



}
