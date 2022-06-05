package decorators;

import composant.Boisson;

public class Sirop extends AbstractDecorator{

	public Sirop(Boisson boisson) {
		super(boisson);
		
	}

	@Override
	public String getDescription() {
		
		return boisson.getDescription() +" au Sirop ";
	}

	@Override
	public double cout() {
		
		return 1.3 + boisson.cout();
	}

}
