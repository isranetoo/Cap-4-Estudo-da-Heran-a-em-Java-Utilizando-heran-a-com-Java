
public class TesteProdutos {
    public static void main(String[] args) {
       
        Eletronico eletronico = new Eletronico("TV LED", 799.99, "Smart TV 55 polegadas", 10, "Samsung", "Modelo ABC123");
        Vestuario vestuario = new Vestuario("Camiseta", 19.99, "Camiseta casual", 50, "Nike", "M", "Branca", "Algodão");
        Alimenticio alimenticio = new Alimenticio("Bolacha", 2.99, "Bolacha recheada", 100, "Nestlé", "2023-12-31", "Farinha, açúcar, recheio");
        Bebida bebida = new Bebida("Cerveja", 3.99, "Cerveja Lager", 200, "AmBev", "2024-06-30", "Água, malte, lúpulo", true, 355.0);

        
        System.out.println("Produto Eletrônico:");
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
    }
}

