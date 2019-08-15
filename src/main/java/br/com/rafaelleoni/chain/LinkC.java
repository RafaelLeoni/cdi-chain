package br.com.rafaelleoni.chain;

public class LinkC implements Link<Request> {

	@Override
	public Integer position() {
		return 2;
	}

	@Override
	public void resolve(Request request) {
		request.setName(request.getName().concat("C"));
		System.out.println("New value after C: " + request);
	}

}
