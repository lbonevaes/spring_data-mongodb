package br.com.fadj.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

/* CLASSE ENTIDADE VIAGEM */

@Document
public class Viagem implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String pessoaId;
	private String origem;
	private String destino;
	private String hrSaida;
	private String custo;
	private String nPassageiros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(String pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHrSaida() {
		return hrSaida;
	}

	public void setHrSaida(String hrSaida) {
		this.hrSaida = hrSaida;
	}

	public String getCusto() {
		return custo;
	}

	public void setCusto(String custo) {
		this.custo = custo;
	}

	public String getnPassageiros() {
		return nPassageiros;
	}

	public void setnPassageiros(String nPassageiros) {
		this.nPassageiros = nPassageiros;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Viagem [id=" + id + ", pessoaId=" + pessoaId + ", origem="
				+ origem + ", destino=" + destino + ", hrSaida=" + hrSaida
				+ " , custo=" + custo + " , nPassageiros=" + nPassageiros + "]";
	}
}
	