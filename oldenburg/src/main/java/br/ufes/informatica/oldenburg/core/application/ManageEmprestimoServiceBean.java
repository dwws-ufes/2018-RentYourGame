package br.ufes.informatica.oldenburg.core.application;

import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.oldenburg.core.domain.Emprestimo;
import br.ufes.informatica.oldenburg.core.persistence.EmprestimoDAO;

@Stateless @PermitAll
public class ManageEmprestimoServiceBean extends CrudServiceBean<Emprestimo> implements ManageEmprestimoService {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private EmprestimoDAO EmprestimoDAO;
		
		@Override
		public BaseDAO<Emprestimo> getDAO() {
				return EmprestimoDAO;
		}
}