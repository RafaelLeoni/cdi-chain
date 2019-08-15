package br.com.rafaelleoni.chain;

public class LinkA implements Link<Request> {

	@Override
	public Integer position() {
		return 0;
	}

	@Override
	public void resolve(Request request) {
		request.setName(request.getName().concat("A"));
		System.out.println("New value after A: " + request);
	}

}
