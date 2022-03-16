package metier;

import dao.Idao;

public class MetierImpl implements IMetier {
	
	//objet null
	private Idao dao;
	
	@Override
	public double Calcul(){
		//Couplage Faible
		
		double tmp=dao.getData();
		double resultat=tmp*43/Math.cos(tmp*Math.PI);
		return resultat;
	}
	
	/* Injecter dans la variable dao un objet d'une classe
	   qui implémente l'interface Idao
	 */
	
	public void setDao(Idao dao) {
		this.dao=dao;
	}
}
