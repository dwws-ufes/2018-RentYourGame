package br.ufes.informatica.oldenburg.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Devolucao extends PersistentObjectSupport implements Comparable<Devolucao> {
	private static final long serialVersionUID = 1L;
	
	@Size(max = 100)
	private String produtoChegou;
	
	

	public String getProdutoChegou() {
		return produtoChegou;
	}



	public void setProdutoChegou(String produtoChegou) {
		this.produtoChegou = produtoChegou;
	}



	@Override
	public int compareTo(Devolucao o) {
		return 1;
	}
}