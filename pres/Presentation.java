package pres;


//import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args)
	{
		//Injection des dépendances
		//Instanciation Statique
		//DaoImpl dao= new DaoImpl(); //objet dao version bd
		DaoImplV2 dao= new DaoImplV2(); //objet dao version capteur
		MetierImpl metier= new MetierImpl();
		metier.setDao(dao);
		System.out.println("Résultat: " + metier.Calcul());
	}
}
