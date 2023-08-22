import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
    private double precoCusto;
    private List<Imposto> impostos;
    private double margemLucro;
	
    public Produto(String nome, double precoCusto, double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.impostos = new ArrayList<>();
		this.margemLucro = margemLucro;
	}
    
    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }
    
	public String getNome() {
		return nome;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public List<Imposto> getImpostos() {
		return impostos;
	}
	public double getMargemLucro() {
		return margemLucro;
	}
	public double calcularPrecoVenda() {
        double totalImpostos = 0;
        for (Imposto imposto : impostos) {
            totalImpostos += imposto.retornaImposto(precoCusto);
        }
        double precoDeCustoFinal = totalImpostos+getPrecoCusto();
        double lucro = (margemLucro/100)*precoDeCustoFinal;
        double precoVenda=precoDeCustoFinal+lucro ;
        return precoVenda;
    }
	
	public String obterNomesImpostos(Produto produto) {
        List<Imposto> impostos = produto.getImpostos();
        List<String> nomesImpostos = new ArrayList<>();

        for (Imposto imposto : impostos) {
            nomesImpostos.add(imposto.getNome());
        }

        return String.join(", ", nomesImpostos);
    }
	
}
