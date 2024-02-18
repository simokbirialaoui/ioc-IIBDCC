package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);
        System.out.println("Res=" + metier.calcul());

    }

}
