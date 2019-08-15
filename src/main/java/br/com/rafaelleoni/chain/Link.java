package br.com.rafaelleoni.chain;

public interface Link<I> {
	
	Integer position();
	
	void resolve(I i);

}
