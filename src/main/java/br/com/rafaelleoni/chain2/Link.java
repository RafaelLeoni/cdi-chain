package br.com.rafaelleoni.chain2;

public abstract class Link<T> {

	private Link<T> link;
	
	public Link<T> linkWith(Link<T> link) {
		return this.link = link;
	}
	
	public abstract void resolve(T t);
	
	protected void next(T t) {
		if (link == null) {
            return;
        }
		link.resolve(t);
	}
	
}
