package br.com.rafaelleoni.chain2;

import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/api2")
public class Api {
	
	@Inject
	private LinkA chain;
	
	@GET
	public void get(@QueryParam("name") String name) {
		Request request = new Request(name);
		System.out.println(request);
		
		chain.linkWith(inject(LinkB.class))
			.linkWith(inject(LinkC.class));
		
		chain.resolve(request);
	}
	
	private <T> T inject(Class<T> clazz) {
		return CDI.current().select(clazz).get();
	}
	
}
