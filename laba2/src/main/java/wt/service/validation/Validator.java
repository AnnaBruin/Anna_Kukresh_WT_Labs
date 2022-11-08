package wt.service.validation;

import wt.entity.criteria.Criteria;

/**
 * Data validation class
 *
 * @author 		Pavel Shalyga
 * @version 	1.0
 */
public class Validator {
	/**
	 * Check incoming criteria for null value
	 *
	 * @param criteria value to check
	 * @return true - if criteria exist and have a group name & params container
	 * 		   false - all remaining cases
	 * @see Criteria
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		return criteria != null && criteria.getGroupSearchName() != null && criteria.getCriteria() != null;
	}
}