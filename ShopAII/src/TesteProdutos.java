
//Deu bom
import java.util.Scanner;

public class TesteProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Produto Eletrônico:");
        System.out.print("Nome: ");
        String nomeEletronico = scanner.nextLine();
        System.out.print("Preço: ");
        double precoEletronico = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricaoEletronico = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloEletronico = scanner.nextLine();
        System.out.print("Estoque: ");
        int estoqueEletronico = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricanteEletronico = scanner.nextLine();

        Eletronico eletronico = new Eletronico(nomeEletronico, precoEletronico, descricaoEletronico, estoqueEletronico, fabricanteEletronico, modeloEletronico);

        System.out.println("\nCadastro de Produto de Vestuário:");
        System.out.print("Nome: ");
        String nomeVestuario = scanner.nextLine();
        System.out.print("Preço: ");
        double precoVestuario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricaoVestuario = scanner.nextLine();
        System.out.print("Tamanho: ");
        String tamanhoVestuario = scanner.nextLine();
        System.out.print("Cor: ");
        String corVestuario = scanner.nextLine();
        System.out.print("Material: ");
        String materialVestuario = scanner.nextLine();
        System.out.print("Estoque: ");
        int estoqueVestuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricanteVestuario = scanner.nextLine();

        Vestuario vestuario = new Vestuario(nomeVestuario, precoVestuario, descricaoVestuario, estoqueVestuario, fabricanteVestuario, tamanhoVestuario, corVestuario, materialVestuario);

        System.out.println("\nCadastro de Produto Alimentício:");
        System.out.print("Nome: ");
        String nomeAlimenticio = scanner.nextLine();
        System.out.print("Preço: ");
        double precoAlimenticio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricaoAlimenticio = scanner.nextLine();
        System.out.print("Data de Validade: ");
        String dataValidadeAlimenticio = scanner.nextLine();
        System.out.print("Ingredientes: ");
        String ingredientesAlimenticio = scanner.nextLine();
        System.out.print("Estoque: ");
        int estoqueAlimenticio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricanteAlimenticio = scanner.nextLine();

        Alimenticio alimenticio = new Alimenticio(nomeAlimenticio, precoAlimenticio, descricaoAlimenticio, estoqueAlimenticio, fabricanteAlimenticio, dataValidadeAlimenticio, ingredientesAlimenticio);

        System.out.println("\nCadastro de Bebida:");
        System.out.print("Nome: ");
        String nomeBebida = scanner.nextLine();
        System.out.print("Preço: ");
        double precoBebida = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricaoBebida = scanner.nextLine();
        System.out.print("Data de Validade: ");
        String dataValidadeBebida = scanner.nextLine();
        System.out.print("Ingredientes: ");
        String ingredientesBebida = scanner.nextLine();
        System.out.print("Alcoólica (Sim/Não): ");
        boolean alcoolicaBebida = scanner.nextLine().equalsIgnoreCase("Sim");
        System.out.print("Volume (ml): ");
        double volumeBebida = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Estoque: ");
        int estoqueBebida = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricanteBebida = scanner.nextLine();

        Bebida bebida = new Bebida(nomeBebida, precoBebida, descricaoBebida, estoqueBebida, fabricanteBebida, dataValidadeBebida, ingredientesBebida, alcoolicaBebida, volumeBebida);

    
        System.out.println("\nProduto Eletrônico:");
        System.out.println("Nome: " + eletronico.getNome());
        System.out.println("Preço: $" + eletronico.getPreco());
        System.out.println("Descrição: " + eletronico.getDescricao());
        System.out.println("Modelo: " + eletronico.getModelo());
        System.out.println("Estoque: " + eletronico.getEstoque());
        System.out.println("Fabricante: " + eletronico.getFabricante());

        System.out.println("\nProduto de Vestuário:");
        System.out.println("Nome: " + vestuario.getNome());
        System.out.println("Preço: $" + vestuario.getPreco());
        System.out.println("Descrição: " + vestuario.getDescricao());
        System.out.println("Tamanho: " + vestuario.getTamanho());
        System.out.println("Cor: " + vestuario.getCor());
        System.out.println("Material: " + vestuario.getMaterial());
        System.out.println("Estoque: " + vestuario.getEstoque());
        System.out.println("Fabricante: " + vestuario.getFabricante());

        System.out.println("\nProduto Alimentício:");
        System.out.println("Nome: " + alimenticio.getNome());
        System.out.println("Preço: $" + alimenticio.getPreco());
        System.out.println("Descrição: " + alimenticio.getDescricao());
        System.out.println("Data de Validade: " + alimenticio.getDataValidade());
        System.out.println("Ingredientes: " + alimenticio.getIngredientes());
        System.out.println("Estoque: " + alimenticio.getEstoque());
        System.out.println("Fabricante: " + alimenticio.getFabricante());

        System.out.println("\nBebida:");
        System.out.println("Nome: " + bebida.getNome());
        System.out.println("Preço: $" + bebida.getPreco());
        System.out.println("Descrição: " + bebida.getDescricao());
        System.out.println("Data de Validade: " + bebida.getDataValidade());
        System.out.println("Ingredientes: " + bebida.getIngredientes());
        System.out.println("Alcoólica: " + (bebida.getAlcoolica() ? "Sim" : "Não"));
        System.out.println("Volume: " + bebida.getVolume() + " ml");
        System.out.println("Estoque: " + bebida.getEstoque());
        System.out.println("Fabricante: " + bebida.getFabricante());

        scanner.close();
    }
}

