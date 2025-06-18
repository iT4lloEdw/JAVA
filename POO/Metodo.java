package empresa.dados;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Salario: " + salario;
    }
}

import empresa.dados.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Zeca", 5000.00);
        System.out.println(funcionario.obterInfo());
    }
}

 // 📄 Descrição do Projeto: Folha de Pagamento (Java)
Este é um exemplo simples de aplicação Java que demonstra os princípios de Programação Orientada a Objetos (POO) utilizando:

Criação de classes

Encapsulamento de atributos

Uso de construtor

Criação de método para exibir dados formatados

A classe Funcionario representa um funcionário com nome e salário, e fornece o método obterInfo() para retornar essas informações em formato de texto.
A classe FolhaDePagamento instancia um objeto Funcionario e imprime suas informações no console.

🚀 O que o código faz?
Cria um objeto Funcionario com nome e salário definidos.

Chama o método obterInfo() para retornar os dados formatados.

Imprime os dados no terminal.
