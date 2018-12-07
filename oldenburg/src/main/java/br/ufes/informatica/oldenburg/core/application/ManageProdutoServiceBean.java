
package br.ufes.informatica.oldenburg.core.application;

import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.oldenburg.core.domain.Produto;
import br.ufes.informatica.oldenburg.core.persistence.ProdutoDAO;

@Stateless @PermitAll 
public class ManageProdutoServiceBean extends CrudServiceBean<Produto> implements ManageProdutoService {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private ProdutoDAO ProdutoDAO;
		
		@Override
		public BaseDAO<Produto> getDAO() {
				return ProdutoDAO;
		}
}
