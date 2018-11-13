package br.ufes.informatica.oldenburg.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Endereco extends PersistentObjectSupport implements Comparable<Endereco> {
	private static final long serialVersionUID = 1L;
	
	@Size(max = 100)
	private String cep;
	
	@Size(max = 100)
	private String rua;
	
	@Size(max = 100)
	private String numero;
	
	@Size(max = 100)
	private String cidade;
	
	@Size(max = 100)
	private String estado;
	
	@Size(max = 100)
	private String pais;
	
	

	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
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



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	@Override
	public int compareTo(Endereco o) {
		return 1;
	}
}