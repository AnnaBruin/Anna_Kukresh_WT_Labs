package wt.dao;

import wt.entity.Appliance;
import wt.entity.criteria.Criteria;

/**
 * Interface that describe Appliance DAO
 *
 * @version     1.0
 * @author      Pavel Shalyga
 */
public interface ApplianceDAO {
    /**
     * Look for appliance that meets the criteria
     *
     * @param       criteria {@link Criteria} contains data to search appliance
     * @return      the appliance that meets required params
     * @see wt.dao.impl.ApplianceDAOImpl
     */
    Appliance find(Criteria criteria);
}