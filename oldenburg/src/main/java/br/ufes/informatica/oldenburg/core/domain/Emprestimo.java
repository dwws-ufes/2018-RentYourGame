package br.ufes.informatica.oldenburg.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Emprestimo extends PersistentObjectSupport implements Comparable<Emprestimo> {
	private static final long serialVersionUID = 1L;
	
	@Size(max = 100)
	private String produtoDisponivel;
	
	@Size(max = 100)
	private String filaEspera;
	
	@NotNull @Temporal(TemporalType.DATE)
	private Date dataEmprestimo;
	
	private Produto produto;
	
	

	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public String getProdutoDisponivel() {
		return produtoDisponivel;
	}



	public void setProdutoDisponivel(String produtoDisponivel) {
		this.produtoDisponivel = produtoDisponivel;
	}



	public String getFilaEspera() {
		return filaEspera;
	}



	public void setFilaEspera(String filaEspera) {
		this.filaEspera = filaEspera;
	}



	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}



	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}



	@Override
	public int compareTo(Emprestimo o) {
		return 1;
	}
}