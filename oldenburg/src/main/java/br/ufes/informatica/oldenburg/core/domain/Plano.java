package br.ufes.informatica.oldenburg.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Plano extends PersistentObjectSupport implements Comparable<Plano> {
	private static final long serialVersionUID = 1L;
	
	@Size(max = 100)
	private String  valor;
	
	@Size(max = 100)
	private String  login;
	
	//@Size(max = 100)
	//private String categoriaPlano;
	
	//@Size(max = 100)
	//private String formaPagamento;
	
	@Enumerated(EnumType.STRING)
    private categoriaPlano categoriaPlano;
	
	@Enumerated(EnumType.STRING)
    private formaPagamento formaPagamento;
	
	 @Temporal(TemporalType.DATE)
	private Date dataVencimento; 
	
	public categoriaPlano[] getCategorias(){
		return br.ufes.informatica.oldenburg.core.domain.categoriaPlano.values();
	}
	
	public formaPagamento[] getFormas(){
		return br.ufes.informatica.oldenburg.core.domain.formaPagamento.values();
	}

	

	public String getValor() {
		return valor;
	}




	public void setValor(String valor) {
		this.valor = valor;
	}


	public categoriaPlano getCategoriaPlano() {
		return categoriaPlano;
	
	}




	public void setCategoriaPlano(categoriaPlano categoriaPlano) {
		this.categoriaPlano = categoriaPlano;
	}




	public formaPagamento getFormaPagamento() {
		return formaPagamento;
	}




	public void setFormaPagamento(formaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}




	public Date getDataVencimento() {

		return dataVencimento;
	}
	



	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	




	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public int compareTo(Plano o) {
		return 1;
	}
}