package br.ufes.informatica.oldenburg.core.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import br.ufes.informatica.oldenburg.core.application.ManageEmprestimoService;
import br.ufes.informatica.oldenburg.core.domain.Emprestimo;

@Named @SessionScoped
public class ManageEmprestimoController extends CrudController<Emprestimo> {
	private static final long serialVersionUID = 1L;

	@EJB
	private ManageEmprestimoService manageEmprestimoService;
	
	@Override
	protected CrudService<Emprestimo> getCrudService() {
		return manageEmprestimoService;
	}

	@Override
	protected void initFilters() { }
}
