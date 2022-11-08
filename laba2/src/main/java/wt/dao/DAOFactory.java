package wt.dao;

import wt.dao.impl.ApplianceDAOImpl;

/**
 * Class that supply different dao
 *
 * @author 		Pavel Shalyga
 * @version 	1.0
 */
public final class DAOFactory {
    /**
     * This field contains factory instance object
     */
    private static final DAOFactory instance = new DAOFactory();
    /**
     * This field contains Appliance dao implementation
     */
    private final ApplianceDAO applianceDAO;

    /**
     * Factory constructor
     */
    private DAOFactory() {
        this.applianceDAO = new ApplianceDAOImpl();
    }

    /**
     * Return instance of the DAO factory
     *
     * @return      factory object
     */
    public static DAOFactory getInstance() {
        return instance;
    }

    /**
     * Return instance of the Appliance DAO
     *
     * @return      appliance dao object
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
