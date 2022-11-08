package wt.service;

import wt.entity.Appliance;
import wt.entity.criteria.Criteria;

/**
 * Interface that describe appliance Service layer
 */
public interface ApplianceService {
	/**
	 * Look for appliance that meet the criteria
	 *
	 * @param criteria container that contains request params
	 * @return requested appliance
	 * @see wt.service.impl.ApplianceServiceImpl
	 */
	Appliance find(Criteria criteria);
}
