package patterndeco;

import composant.Boisson;
import composant.Cappucin;
import composant.cafe;
import decorators.Caramel;
import decorators.Chocolat;
import decorators.Sirop;

public class App {
public static void main (String[] arg) {
	Boisson boisson = new cafe();
	System.out.println(boisson.getDescription());
	System.out.println(boisson.cout());
	boisson = new Chocolat(boisson);
	boisson = new Sirop(boisson);
	boisson = new Caramel(boisson);
	boisson = new Caramel(boisson);
	System.out.println(boisson.getDescription());
	System.out.println(boisson.cout());
	Boisson b2 =new Chocolat(new Sirop(new Caramel(new Cappucin())));
	System.out.println(b2.getDescription());
	System.out.println(b2.cout());
	

}

}
