package br.com.bycoders.cadastrotransacaoservice.VO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import br.com.bycoders.cadastrotransacaoservice.entity.Transacao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TransacaoVO {

	private Integer tipoCodigo;
	private String tipoDescricao;
	private String data;
	private BigDecimal valor;
	private String cpf;
	private String cartao;
	private LocalTime hora;
	private String donoLoja;
	private String nomeLoja;

	public TransacaoVO(Transacao transacao) {
		this.tipoCodigo = transacao.getTipo().getCodigo();
		this.tipoDescricao = transacao.getTipo().getDescricao();
		this.data = transacao.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.hora = transacao.getHora();
		this.cpf = transacao.getCpf();
		this.cartao = transacao.getCartao();
		this.donoLoja = transacao.getDonoLoja();
		this.nomeLoja = transacao.getNomeLoja();
		this.valor = transacao.getValor();

	}

	public Integer getTipoCodigo() {
		return tipoCodigo;
	}

	public void setTipoCodigo(Integer tipoCodigo) {
		this.tipoCodigo = tipoCodigo;
	}

	public String getTipoDescricao() {
		return tipoDescricao;
	}

	public void setTipoDescricao(String tipoDescricao) {
		this.tipoDescricao = tipoDescricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getDonoLoja() {
		return donoLoja;
	}

	public void setDonoLoja(String donoLoja) {
		this.donoLoja = donoLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	

}
