package decorators;

import composant.Boisson;

public class Caramel extends AbstractDecorator{
	public Caramel(Boisson boisson) {
		super(boisson);	}
	
	@Override
	public String getDescription() {
		
		return boisson.getDescription() +" au Caramel ";	}
	
	@Override
	public double cout() {
		return 2.3 + boisson.cout();  }

}
