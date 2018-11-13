package br.ufes.informatica.oldenburg.core.application;

import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.oldenburg.core.domain.Devolucao;
import br.ufes.informatica.oldenburg.core.persistence.DevolucaoDAO;

@Stateless @PermitAll
public class ManageDevolucaoServiceBean extends CrudServiceBean<Devolucao> implements ManageDevolucaoService {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private DevolucaoDAO workshopDAO;
		
		@Override
		public BaseDAO<Devolucao> getDAO() {
				return workshopDAO;
		}
}
