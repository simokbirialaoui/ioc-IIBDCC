package pres;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        // MetierImpl metier = new MetierImpl();
        //   metier.setDao(dao);  //Injection via le setter

        System.out.println("Res=" + metier.calcul());

    }

}
