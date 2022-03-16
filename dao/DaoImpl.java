package dao;


public class DaoImpl implements Idao {
	@Override
	public double getData() {
		/* Version Base De Données */
		double temp=Math.random()*40;
		System.out.println("Version base de données :");
		return temp;
	}
}
