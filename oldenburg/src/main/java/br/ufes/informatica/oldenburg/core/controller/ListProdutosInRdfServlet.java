package br.ufes.informatica.oldenburg.core.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

import br.ufes.informatica.oldenburg.core.persistence.ProdutoDAO;
import br.ufes.informatica.oldenburg.core.domain.Produto;


@WebServlet(urlPatterns = { "/data/games" })
public class ListProdutosInRdfServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ProdutoDAO produtoDAO;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/xml");
		List<Produto> produtos = produtoDAO.retrieveAll();
		Model model = ModelFactory.createDefaultModel();
		String myNS	= "http://localhost:8080/oldenburg/data/games/";
		String dboNS = "http://dbpedia.org/ontology/";
		String rdfsNS = "http://www.w3.org/2000/01/rdf-schema#";
		String gameNS = "http://purl.org/net/VideoGameOntology/";
		
		model.setNsPrefix("dbo", dboNS);
		model.setNsPrefix("rdfs", rdfsNS);
		model.setNsPrefix("VideoGameOntology", gameNS);
		
		Property genero = ResourceFactory.createProperty(dboNS,"genre");
		Property classificacaoIndicativa = ResourceFactory.createProperty(dboNS,"classificacaoIndicativa");
		Property plataforma = ResourceFactory.createProperty(dboNS,"computingPlatform");
		Property audio = ResourceFactory.createProperty(dboNS,"audio");
		Property legendas = ResourceFactory.createProperty(dboNS,"legendas");
		Property multiplayer = ResourceFactory.createProperty(dboNS,"modes");
		
		for (Produto produto : produtos) {
			model.createResource(myNS + produto.getName())
			.addProperty(RDF.type, "VideoGameOntology")
			.addProperty(RDFS.label, produto.getName())			
			.addProperty(RDFS.comment, produto.getResumo())
			.addProperty(genero, produto.getGenero())
			.addProperty(classificacaoIndicativa, produto.getClassificacaoIndicativa())
			.addProperty(plataforma, produto.getPlataforma())
			.addProperty(audio, produto.getAudio())
			.addProperty(legendas, produto.getLegendas())
			.addProperty(multiplayer, produto.getMultiplayer())

		;
		}
		try (PrintWriter out = resp.getWriter()) {
			model.write(out, "RDF/XML");
		}
		
	}
		

}