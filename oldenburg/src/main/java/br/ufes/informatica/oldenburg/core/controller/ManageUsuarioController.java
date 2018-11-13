package br.ufes.informatica.oldenburg.core.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import br.ufes.informatica.oldenburg.core.application.ManageUsuarioService;
import br.ufes.informatica.oldenburg.core.domain.Usuario;
import br.ufes.informatica.oldenburg.core.domain.Endereco;

@Named @SessionScoped
public class ManageUsuarioController extends CrudController<Usuario> {
	private static final long serialVersionUID = 1L;

	@EJB
	private ManageUsuarioService manageUsuarioService;
	
	private Usuario usuario= new Usuario();
	
	@Override
	protected Usuario createNewEntity() {

		usuario.setEndereco(new Endereco());
		return usuario;
	}
	
	@Override
	protected CrudService<Usuario> getCrudService() {
		return manageUsuarioService;
	}

	@Override
	protected void initFilters() { }
}