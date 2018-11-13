package br.ufes.informatica.oldenburg.core.application;

import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.oldenburg.core.domain.Usuario;
import br.ufes.informatica.oldenburg.core.domain.Endereco;
import br.ufes.informatica.oldenburg.core.persistence.UsuarioDAO;

@Stateless @PermitAll
public class ManageUsuarioServiceBean extends CrudServiceBean<Usuario> implements ManageUsuarioService {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private UsuarioDAO UsuarioDAO;
		
		@Override
		public BaseDAO<Usuario> getDAO() {
				return UsuarioDAO;
		}
}