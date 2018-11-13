package br.ufes.informatica.oldenburg.core.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import br.ufes.informatica.oldenburg.core.application.ManageProdutoService;
import br.ufes.informatica.oldenburg.core.domain.Produto;

@Named @SessionScoped
public class ManageProdutoController extends CrudController<Produto> {
	private static final long serialVersionUID = 1L;

	@EJB
	private ManageProdutoService manageProdutoService;
	
	@Override
	protected CrudService<Produto> getCrudService() {
		return manageProdutoService;
	}

	@Override
	protected void initFilters() { }
}