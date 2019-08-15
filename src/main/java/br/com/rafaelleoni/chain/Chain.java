package br.com.rafaelleoni.chain;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@SuppressWarnings({ "unchecked" })
public class Chain<T> extends ArrayList<Link<T>> {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private	Instance<Link<?>> instances;
	
	@PostConstruct
	public void init() {
		Iterator<Link<?>> iterator = instances.iterator();
		while(iterator.hasNext()) {
			add((Link<T>) iterator.next());
		}
		this.sort((Link<?> l1, Link<?> l2) -> l1.position().compareTo(l2.position()));
	}
	
	public void execute(T obj) {
		this.forEach(link -> link.resolve(obj));
	}

}
