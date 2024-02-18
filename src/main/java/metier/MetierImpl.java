package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getDate();
        double res = t * 30;
        return res;
    }
}
