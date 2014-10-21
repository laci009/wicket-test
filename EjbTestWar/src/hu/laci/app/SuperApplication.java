package hu.laci.app;

import hu.laci.hello.HelloPage;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.wicketstuff.javaee.injection.JavaEEComponentInjector;
import org.wicketstuff.javaee.naming.global.AppJndiNamingStrategy;

public class SuperApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HelloPage.class;
	}
	
	@Override
	protected void init() {
		super.init();

		getComponentInstantiationListeners().add(
				new JavaEEComponentInjector(this, 
						new AppJndiNamingStrategy("EjbTest")));
//		getComponentInstantiationListeners().add(
//				new JavaEEComponentInjector(this, 
//						new ModuleJndiNamingStrategy()));
	}

}
