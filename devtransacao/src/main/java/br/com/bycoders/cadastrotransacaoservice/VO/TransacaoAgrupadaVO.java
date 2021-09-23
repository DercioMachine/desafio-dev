package br.com.bycoders.cadastrotransacaoservice.VO;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TransacaoAgrupadaVO {

	private String nomeLoja;
	private String donoLoja;
	private BigDecimal saldo;
	private List<TransacaoVO> transacoes;

	public TransacaoAgrupadaVO(List<TransacaoVO> trasacoes) {
		this.nomeLoja = trasacoes.get(0).getNomeLoja();
		this.donoLoja = trasacoes.get(0).getDonoLoja();
		this.transacoes = trasacoes;
		this.saldo = trasacoes.stream().map(t -> t.getValor()).reduce(BigDecimal.ZERO, BigDecimal::add);

	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getDonoLoja() {
		return donoLoja;
	}

	public void setDonoLoja(String donoLoja) {
		this.donoLoja = donoLoja;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public List<TransacaoVO> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<TransacaoVO> transacoes) {
		this.transacoes = transacoes;
	}
	

}
