
public class Imposto {
	private String nome;
	private Double valor;
	
	public Imposto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public double retornaImposto(double precoDeCusto) {
        return valor*precoDeCusto;
    }
	
	
}
