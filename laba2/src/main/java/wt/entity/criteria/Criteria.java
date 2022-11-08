package wt.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * This class describe params, that compile the search request
 *
 * @author 		Pavel Shalyga
 * @version 	1.0
 */
public class Criteria {
    /**
     * Appliance group name representation
     */
    private final String groupSearchName;
    /**
     * Container with entered params
     */
    private final Map<String, Object> criteria;

    /**
     * Criteria constructor
     *
     * @param groupSearchName  appliance group representation
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
        this.criteria = new HashMap<>();
    }

    /**
     * Group name getter
     *
     * @return group name representation
     */
    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Construct search criteria
     *
     * @param searchCriteria     criteria name
     * @param value              criteria value
     */
    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    /**
     * Returns criteria params correspond to this object
     *
     * @return criteria container
     */
    public Map<String, Object> getCriteria() {
        return criteria;
    }
}
