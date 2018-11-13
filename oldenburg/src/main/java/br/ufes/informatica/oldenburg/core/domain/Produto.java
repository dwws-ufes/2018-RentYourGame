package br.ufes.informatica.oldenburg.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Produto extends PersistentObjectSupport implements Comparable<Produto> {
	private static final long serialVersionUID = 1L;
	
	@Size(max = 100)
	private String name;
	
	@Size(max = 100)
	private String classificacaoIndicativa;
	
	@Size(max = 100)
	private String plataforma;
	
	@Size(max = 100)
	private String genero;
	
	@Size(max = 100)
	private String audio;
	
	@Size(max = 100)
	private String legendas;
	
	@Size(max = 100)
	private String multiplayer;
	
	@Size(max = 100)
	private String quantidadeEstoque;

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getLegendas() {
		return legendas;
	}

	public void setLegendas(String legendas) {
		this.legendas = legendas;
	}

	public String getMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(String multiplayer) {
		this.multiplayer = multiplayer;
	}

	public String getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(String quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	@Override
	public int compareTo(Produto o) {
		return 1;
	}
	
	
	
	
}