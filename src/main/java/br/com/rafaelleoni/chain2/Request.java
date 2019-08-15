package br.com.rafaelleoni.chain2;

public class Request {
	
	private String name;
	
	public Request(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Request [name=" + name + "]";
	}

}
