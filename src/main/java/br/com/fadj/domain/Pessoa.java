package br.com.fadj.domain;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/* CLASSE ENTIDADE PESSOA */

@Document
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String telefone;
	private String celular;
	private String email;
	private Date dtNascimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco
				+ ", cidade=" + cidade + ", estado=" + estado + " , telefone="
				+ telefone + " , celular=" + celular + " , email=" + email
				+ "]";
	}

}
