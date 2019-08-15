package br.com.rafaelleoni.chain;

public class LinkB implements Link<Request> {

	@Override
	public Integer position() {
		return 1;
	}

	@Override
	public void resolve(Request request) {
		request.setName(request.getName().concat("B"));
		System.out.println("New value after B: " + request);
	}

}
