package br.ufes.informatica.oldenburg.core.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.informatica.oldenburg.core.domain.Usuario;

@Stateless
public class UsuarioJPADAO extends BaseJPADAO<Usuario> implements UsuarioDAO {
		private static final long serialVersionUID = 1L;
		
		@PersistenceContext
		private EntityManager entityManager;
		
		@Override
		protected EntityManager getEntityManager() {
				return entityManager;
				
		}

}