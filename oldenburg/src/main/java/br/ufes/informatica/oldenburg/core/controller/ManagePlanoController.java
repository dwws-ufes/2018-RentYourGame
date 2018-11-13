package br.ufes.informatica.oldenburg.core.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import br.ufes.informatica.oldenburg.core.application.ManagePlanoService;
import br.ufes.informatica.oldenburg.core.domain.Plano;
import br.ufes.informatica.oldenburg.core.domain.categoriaPlano;
import br.ufes.informatica.oldenburg.core.domain.formaPagamento;

@Named @SessionScoped
public class ManagePlanoController extends CrudController<Plano> {
	private static final long serialVersionUID = 1L;

	@EJB
	private ManagePlanoService managePlanoService;
	
	@Override
	protected CrudService<Plano> getCrudService() {
		return managePlanoService;
		//this.save();
	}

	@Override
	protected void initFilters() { }
	
	public categoriaPlano[] getCategorias(){
		return categoriaPlano.values();
	}
	
	public formaPagamento[] getFormas(){
		return formaPagamento.values();
	}
	
	public String retorna () {
		return "1";
	}
	
}