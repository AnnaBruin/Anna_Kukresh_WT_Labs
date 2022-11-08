package wt.service.impl;

import wt.dao.ApplianceDAO;
import wt.dao.DAOFactory;
import wt.entity.Appliance;
import wt.entity.criteria.Criteria;
import wt.service.ApplianceService;
import wt.service.validation.Validator;

/**
 *  Implementation of the {@link ApplianceService} interface, that represent Service layer
 *
 * @author 		Pavel Shalyga
 * @version 	1.0
 */
public class ApplianceServiceImpl implements ApplianceService {

	/**
	 * Look for appliances with consumed criteria
	 *
	 * @param criteria  representation of the request params
	 * @return 			appliance, that meets criteria
	 * @see Criteria
	 * @see Appliance
	 */
	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		return applianceDAO.find(criteria);
	}
}