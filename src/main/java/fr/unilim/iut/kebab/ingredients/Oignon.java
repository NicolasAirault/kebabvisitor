package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.visitor.VisiteurRegime;

public class Oignon extends Ingredient {

	public Oignon(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isVegetarien() {
		return super.isVegetarien();
	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}

	@Override
	public void accept(VisiteurRegime visiteurRegime) {
		visiteurRegime.visit(this);
		
	}

}
