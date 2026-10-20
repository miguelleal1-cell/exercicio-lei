

import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalProdutos = 0;
        double valorTotalEstoque = 0.0;
        String nomeMaisCaro = "";
        double precoMaisCaro = -1.0;

        char opcao;

        do {
            System.out.println("\n--- Cadastro de Produto ---");

            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Preço do produto: R$ ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade em estoque: ");
            int quantidade = scanner.nextInt();

            // Atualiza o total de produtos e o valor acumulado em estoque
            totalProdutos++;
            valorTotalEstoque += (preco * quantidade);

            // Verifica se é o produto mais caro
            if (preco > precoMaisCaro) {
                precoMaisCaro = preco;
                nomeMaisCaro = nome;
            }

            System.out.print("\nDeseja cadastrar outro produto? (s/n): ");
            opcao = scanner.nexconst readline = require('readline-sync');

let totalProdutos = 0;
let valorTotalEstoque = 0;
let nomeMaisCaro = '';
let precoMaisCaro = -1;

let opcao;

do {
    console.log('\n--- Cadastro de Produto ---');
    
    let nome = readline.question('Nome do produto: ');
    let preco = parseFloat(readline.question('Preco do produto: R$ '));
    let quantidade = parseInt(readline.question('Quantidade em estoque: '));

    // Atualiza estatísticas gerais
    totalProdutos++;
    valorTotalEstoque += (preco * quantidade);

    // Verifica se é o produto mais caro até o momento
    if (preco > precoMaisCaro) {
        precoMaisCaro = preco;
        nomeMaisCaro = nome;
    }

    // Pergunta ao usuário se deseja continuar
    opcao = readline.question('\nDeseja cadastrar outro produto? (s/n): ');

} while (opcao.toLowerCase() === 's');

// Apresentação dos resultados finais
console.log('\n====================================');
console.log('RESUMO DO CADASTRO DE PRODUTOS');
console.log('====================================');
console.log(`Quantidade total de produtos cadastrados: ${totalProdutos}`);
console.log(`Valor total do estoque: R$ ${valorTotalEstoque.toFixed(2)}`);

if (totalProdutos > 0) {
    console.log(`Produto mais caro: ${nomeMaisCaro} (R$ ${precoMaisCaro.toFixed(2)})`);
}
console.log('====================================');t().charAt(0);

            // Limpa o buffer do teclado para ler o próximo nome corretamente
            scanner.nextLine();

        } while (opcao == 's' || opcao == 'S');

        // Apresentação dos resultados finais
        System.out.println("\n====================================");
        System.out.println("RESUMO DO CADASTRO DE PRODUTOS");
        System.out.println("====================================");
        System.out.println("Quantidade total de produtos cadastrados: " + totalProdutos);
        System.out.printf("Valor total do estoque: R$ %.2f\n", valorTotalEstoque);

        if (totalProdutos > 0) {
            System.out.printf("Produto mais caro: %s (R$ %.2f)\n", nomeMaisCaro, precoMaisCaro);
        }
        System.out.println("====================================");

        scanner.close();
    }
}