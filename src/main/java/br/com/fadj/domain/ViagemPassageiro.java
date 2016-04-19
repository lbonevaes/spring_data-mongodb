package br.com.fadj.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

/* CLASSE ENTIDADE VIAGEM PASSAGEIROS */

@Document
public class ViagemPassageiro implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long viagemId;
	private Long pessoaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getViagemId() {
		return viagemId;
	}

	public void setViagemId(Long viagemId) {
		this.viagemId = viagemId;
	}

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	@Override
	public String toString() {
		return "ViagemPasssageiro [id=" + id + ", viagemId=" + viagemId
				+ ", pessoaId=" + pessoaId + "]";
	}
}
