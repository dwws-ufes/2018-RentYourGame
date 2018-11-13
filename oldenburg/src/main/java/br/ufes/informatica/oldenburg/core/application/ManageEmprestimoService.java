package br.ufes.informatica.oldenburg.core.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.informatica.oldenburg.core.domain.Emprestimo;

@Local
public interface ManageEmprestimoService extends CrudService<Emprestimo> {

}