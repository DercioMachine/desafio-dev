package br.com.bycoders.cadastrotransacaoservice.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.bycoders.cadastrotransacaoservice.enumeration.TipoTransacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transacoes")
public class Transacao extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private TipoTransacaoEnum tipo;
	private LocalDate data;
	private BigDecimal valor;
	private String cpf;
	private String cartao;
	private LocalTime hora;
	private String donoLoja;
	private String nomeLoja;
	public TipoTransacaoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoTransacaoEnum tipo) {
		this.tipo = tipo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
