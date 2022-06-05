package decorators;

import composant.Boisson;

public class Chocolat extends AbstractDecorator{

	public Chocolat(Boisson boisson) {
		super(boisson);
		
	}

	@Override
	public String getDescription() {
		
		return boisson.getDescription() +" au Cocolat ";
	}

	@Override
	public double cout() {
		
		return 1.5 + boisson.cout();
	}

}
