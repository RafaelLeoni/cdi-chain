package br.com.rafaelleoni.chain;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/api")
public class Api {
	
	@Inject
	private Chain<Request> chain;
	
	@GET
	public void get(@QueryParam("name") String name) {
		Request request = new Request(name);
		System.out.println("Begin value: " + request);
		chain.execute(request);
	}
	
}
