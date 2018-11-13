package br.ufes.informatica.oldenburg.core.application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.ufes.informatica.oldenburg.core.domain.Usuario;
import br.ufes.informatica.oldenburg.core.persistence.UsuarioDAO;


public class InitialSeedService implements ServletContextListener {

	@EJB
	private UsuarioDAO usuarioDAO;
	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();


	@Override
	public void contextInitialized(ServletContextEvent arg0) {



		if (usuarioDAO.retrieveCount() == 0) {

			
			Usuario admin = new Usuario();
			admin.setNome("admin");
			admin.setEmail(" ");
			admin.setCpf(" ");
			admin.setLogin("admin");
			admin.setPlanoAtivo(" ");
			admin.setRole("Administrador");
			admin.setSenha("admin");
			admin.setSubmissionDeadline(date);
			usuarioDAO.save(admin);


		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}
}
