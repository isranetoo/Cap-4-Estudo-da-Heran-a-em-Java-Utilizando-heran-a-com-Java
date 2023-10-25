public class Eletronico extends Produto{
	private String modelo;
	
	public Eletronico(String nome, double preco, String descricao, int estoque, String fabricante, String modelo) {
		super(nome, preco, descricao, estoque, fabricante);
		this.modelo = modelo;
    }
	
	public String getModelo() {
        return modelo;
    }
}
