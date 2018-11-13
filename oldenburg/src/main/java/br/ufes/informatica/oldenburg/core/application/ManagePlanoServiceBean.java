package br.ufes.informatica.oldenburg.core.application;

import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.oldenburg.core.domain.Plano;
import br.ufes.informatica.oldenburg.core.persistence.PlanoDAO;

@Stateless @PermitAll
public class ManagePlanoServiceBean extends CrudServiceBean<Plano> implements ManagePlanoService {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private PlanoDAO workshopDAO;
		
		@Override
		public BaseDAO<Plano> getDAO() {
				return workshopDAO;
		}
}