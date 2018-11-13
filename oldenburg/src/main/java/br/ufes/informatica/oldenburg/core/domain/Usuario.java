package br.ufes.informatica.oldenburg.core.domain;



import java.security.Principal;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Usuario extends PersistentObjectSupport implements Comparable<Usuario>{
	
	private static final long serialVersionUID = 1L;
	
	
	@Size(max = 100)
	private String nome;
	
	@Size(max = 100)
	private String role = "Cliente";
	
	@Size(max = 100)
	private String email;
	
	@Size(max = 100)
	private String cpf;
	
	@Size(max = 100)
	private String login;
	
	@Size(max = 100)
	private String planoAtivo;
	
	@Size(max = 100)
	private String senha;
	
	@NotNull @Temporal(TemporalType.DATE)
	private Date submissionDeadline;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Plano plano;
	
	@OneToMany
	private List<Emprestimo> listaEmprestimo;
	
	

	
	
	public List<Emprestimo> getListaEmprestimo() {
		return listaEmprestimo;
	}

	public void setListaEmprestimo(List<Emprestimo> listaEmprestimo) {
		this.listaEmprestimo = listaEmprestimo;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPlanoAtivo() {
		return planoAtivo;
	}

	public void setPlanoAtivo(String planoAtivo) {
		this.planoAtivo = planoAtivo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public Date getSubmissionDeadline() {
		return submissionDeadline;
	}

	public void setSubmissionDeadline(Date submissionDeadline) {
		this.submissionDeadline = submissionDeadline;
	}
	
	@Override
	public int compareTo(Usuario o) {
		return 1;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	



}