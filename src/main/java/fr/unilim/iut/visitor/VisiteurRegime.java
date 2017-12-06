package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public interface VisiteurRegime {
	public void visit(Agneau agneau);
	public void visit(Boeuf boeuf);
	public void visit(Crevette crevette);
	public void visit(Fromage fromage);
	public void visit(Oignon oignon);
	public void visit(Pain pain);
	public void visit(Salade salade);
	public void visit(Sauce sauce);
	public void visit(Thon thon);
	public void visit(Tomate tomate);
	public void visit(Assiette assiette);
}
