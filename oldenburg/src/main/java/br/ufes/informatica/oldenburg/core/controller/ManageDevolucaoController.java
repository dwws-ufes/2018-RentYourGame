package br.ufes.informatica.oldenburg.core.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import br.ufes.informatica.oldenburg.core.application.ManageDevolucaoService;
import br.ufes.informatica.oldenburg.core.domain.Devolucao;

@Named @SessionScoped
public class ManageDevolucaoController extends CrudController<Devolucao> {
	private static final long serialVersionUID = 1L;

	@EJB
	private ManageDevolucaoService manageDevolucaoService;
	
	@Override
	protected CrudService<Devolucao> getCrudService() {
		return manageDevolucaoService;	
	}

	@Override
	protected void initFilters() { }
	


}