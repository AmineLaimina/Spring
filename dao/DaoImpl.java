package dao;


public class DaoImpl implements Idao {
	@Override
	public double getData() {
		/* Version Base De Donn�es */
		double temp=Math.random()*40;
		System.out.println("Version base de donn�es :");
		return temp;
	}
}
