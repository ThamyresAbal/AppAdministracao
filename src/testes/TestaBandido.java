package testes;

import negocio.Bandido;

public class TestaBandido {

	public static void main(String[] args) {
		Bandido bandido = new Bandido();
		bandido.nome = "Michel";
		bandido.apelido = "Vampir�o";
		bandido.descricaoFavor = "Golpe";
		bandido.cidadeAtuacao = "Maric�";
		bandido.cargo = "Assessor";
		bandido.valor = 10000;
		bandido.anoNascimento = 1978;
		bandido.qtdeParcela = 8;
		bandido.exibir();
	}
}
