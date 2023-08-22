import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Imposto icms = new Imposto("ICMS", 0.07);
        Imposto confins = new Imposto("Confins", 0.12);
        Imposto ipi = new Imposto("IPI", 0.08);
        Imposto iss = new Imposto("ISS", 0.05);
        Imposto cide = new Imposto("Cide", 0.10);
        Imposto csll = new Imposto("CSLL", 0.04);

        Produto arroz = new Produto("Arroz", 7.00, 20);
        arroz.adicionarImposto(confins);
        arroz.adicionarImposto(icms);
        arroz.adicionarImposto(iss);

        Produto feijao = new Produto("Feijão", 7.00, 25);
        feijao.adicionarImposto(confins);
        feijao.adicionarImposto(icms);
        feijao.adicionarImposto(iss);

        Produto carne = new Produto("Carne", 7.00, 35);
        carne.adicionarImposto(confins);
        carne.adicionarImposto(icms);
        carne.adicionarImposto(ipi);

        Produto cerveja = new Produto("Cerveja", 7.00, 30);
        cerveja.adicionarImposto(confins);
        cerveja.adicionarImposto(icms);
        cerveja.adicionarImposto(iss);
        cerveja.adicionarImposto(ipi);

        Produto gas = new Produto("Gás", 7.00, 15);
        gas.adicionarImposto(confins);
        gas.adicionarImposto(icms);
        gas.adicionarImposto(ipi);

        Produto gasolina = new Produto("Gasolina", 7.00, 15);
        gasolina.adicionarImposto(confins);
        gasolina.adicionarImposto(icms);
        gasolina.adicionarImposto(cide);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(arroz);
        produtos.add(feijao);
        produtos.add(carne);
        produtos.add(cerveja);
        produtos.add(gas);
        produtos.add(gasolina);

        for (Produto produto : produtos) {
        	System.out.println(produto.getNome()+" : Preço Custo: "+produto.getPrecoCusto()+" Impostos: "
        			+produto.obterNomesImpostos(produto)+" Margem Lucro: "+produto.getMargemLucro()+"%");
        }
        System.out.println("\n");
        for (Produto produto : produtos) {
            double precoVenda = produto.calcularPrecoVenda();
            System.out.printf("Produto: %s - Preço de Venda: R$%.2f%n", produto.getNome(), precoVenda);
        }
        
        
	}


}
