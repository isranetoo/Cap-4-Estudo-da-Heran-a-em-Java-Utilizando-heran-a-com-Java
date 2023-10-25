public class Alimenticio  extends Produto{
	private String dataValidade;
	private String ingredientes;
	
	public Alimenticio(String nome, double preco, String descricao, int estoque, String fabricante, String dataValidade, String ingredientes) {
		super(nome, preco, descricao, estoque, fabricante);
		this.dataValidade = dataValidade;
	    this.ingredientes = ingredientes;
	  }
	
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String datVal) {
		this.dataValidade = datVal;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	
	
}
