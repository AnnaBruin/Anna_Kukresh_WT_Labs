package wt.server.dao;

public class DaoFactory {
    private static final DaoFactory INSTANCE = new DaoFactory();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return INSTANCE;
    }

    public CaseDao getCaseDao() {
        return CaseDao.getInstance();
    }
}