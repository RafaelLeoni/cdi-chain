package br.com.rafaelleoni.chain2;

public class LinkB extends Link<Request> {

	@Override
	public void resolve(Request request) {
		request.setName(this.getClass().getSimpleName());
		System.out.println(request);
		next(request);
	}

}
