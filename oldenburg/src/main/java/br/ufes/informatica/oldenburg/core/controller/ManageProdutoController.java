package br.ufes.informatica.oldenburg.core.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import br.ufes.informatica.oldenburg.core.application.ManageProdutoService;
import br.ufes.informatica.oldenburg.core.domain.Produto;

@Named @SessionScoped
public class ManageProdutoController extends CrudController<Produto> {
	private static final long serialVersionUID = 1L;

	@EJB
	private ManageProdutoService manageProdutoService;
	
	@Override
	protected CrudService<Produto> getCrudService() {
		return manageProdutoService;
	}

	@Override
	protected void initFilters() { }
	
	
	public void sugestaoResumo() {
		String name = this.selectedEntity.getName();
		if (name != null && name.length() > 3) {
		String query = "PREFIX dbo: <http://dbpedia.org/ontology/> " +
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" +
		"SELECT ?desc " +
		"WHERE { " +
			"?x a dbo:VideoGame ; " +
			"rdfs:label ?value ; " +
			"rdfs:comment ?desc . " +
			"FILTER (?value = \"" + name + "\"@pt) " +
			"FILTER (langMatches(lang(?desc), \"PT\")) " +
		"}";
		QueryExecution queryExecution =
		QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", query);
		ResultSet results = queryExecution.execSelect();
		if (results.hasNext()) {
		QuerySolution querySolution = results.next();
		Literal literal = querySolution.getLiteral("desc");
		this.selectedEntity.setResumo("" + literal.getValue());

		}
		}
		}
	
	public void updateText(ValueChangeEvent event){
		   String input = event.getNewValue().toString();
		   System.out.println("input eh " + input);
		}
	
	
	
	
}