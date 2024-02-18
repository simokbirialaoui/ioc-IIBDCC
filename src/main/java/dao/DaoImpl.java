package dao;

public class DaoImpl implements IDao {

    @Override
    public double getDate() {
        System.out.println("version base de données");
        double temp = 30;
        return temp;
    }
}
