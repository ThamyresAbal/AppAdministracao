package negocio;

public class Bandido {

	public String nome;
	public String apelido;
	public int anoNascimento;
	public String cidadeAtuacao;
	public String cargo;
	public float valor;
	public int qtdeParcela;
	public String descricaoFavor;
	
	final float VALOR_TX_ADM = 0.5f;
	final float PERCENTUAL_VL_SOLICITADO = 1.25f;
	final float VALOR_PARCELA = 150f;
	
	public void exibir() {
		System.out.printf(
		"Querido, %s (%s).\n"
		+ "O seu empréstimo acabou de ser aceito:\n"
		+ "%s.\n"
		+ "Espero que esse valor possa melhorar a nossa parceria na cidade de %s.\n"
		+ "E que o poder do seu cargo (%s) posso gerar bons retornos para mim.\n"
		+ "Abaixo apresento os valores:\n"
		+ ">>> Valor solicitado: %.2f\n"
		+ ">>> Taxa administrativa: %.2f\n"
		+ ">>> Juros: %.2f\n"
		+ ">>> Valor a ser pago: %.2f\n"
		+ ">>> Valor da parcela: %.2f (%d)\n"
		+ "Sem temer, muito obrigado pela confiança,\n"
		+ "Michel.\n",
		apelido,
		nome,
		descricaoFavor,
		cidadeAtuacao,
		cargo,
		valor,
		calcularTaxaAdministrativa(),
		calcularJuros(),
		calcularValorPago(),
		calcularValorParcela(),
		qtdeParcela
		);		
	}
	
	private float calcularTaxaAdministrativa() {
		return anoNascimento * VALOR_TX_ADM;
	}
	private float calcularValorPago() {
		return (valor * PERCENTUAL_VL_SOLICITADO) + 
			   (VALOR_PARCELA * qtdeParcela) + 
			   calcularTaxaAdministrativa();
	}	
	private float calcularJuros() {
		return calcularValorPago() - valor;
	}
	private float calcularValorParcela() {
		return calcularValorPago() / qtdeParcela;
	}	
}