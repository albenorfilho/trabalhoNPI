package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.service.ContatoService;
import br.ufc.quixada.npi.service.PessoaService;

@Component
public class Main2 {
	
	@Autowired
	private PessoaService cs;
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Main2 main = (Main2)ctx.getBean("main2");
		try {
			main.cs.insere();
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}
		
		List<Pessoa> l = main.cs.findAll();

	    for (Pessoa c : l) {
	    	System.out.println(c);
	    }
		ctx.close();
	}
	
}
