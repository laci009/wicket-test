package hu.laci.hello;

import hu.laci.SuperServiceLocal;

import javax.ejb.EJB;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

@SuppressWarnings("serial")
public class HelloPage extends WebPage {

	@EJB(name = "SuperService!hu.laci.SuperServiceLocal")
	private SuperServiceLocal superService;
	
	public HelloPage(final PageParameters parameters) {
		add(new Label("message", "Hello World, Wicket"));
		
		String message = "AJJJAJ";
		if (superService != null) {
			message = superService.getStuff("woooHoooo");
		}
		add(new Label("message2", message));
		
		//New way:
		new Thread(
		    () -> System.out.println("Hello from thread")
		).start();
	}

}
