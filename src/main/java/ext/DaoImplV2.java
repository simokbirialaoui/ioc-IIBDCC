package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoV2")
public class DaoImplV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("version web service ");
        double temp = 16;
        return temp;
    }
}
