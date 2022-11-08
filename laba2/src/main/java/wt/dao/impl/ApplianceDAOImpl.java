package wt.dao.impl;

import wt.dao.ApplianceDAO;
import wt.entity.Appliance;
import wt.entity.criteria.Criteria;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This is the implementation of {@link ApplianceDAO} interface, which represent DAO layer
 *
 * @author 		Pavel Shalyga
 * @version 	1.0
 */
public class ApplianceDAOImpl implements ApplianceDAO {
	/**
	 * Path to file with appliance information
	 */
	private static final String FILE_PATH = ".\\src\\main\\resources\\appliances_db.txt";
	/**
	 * Representation of the group delimiter symbol
	 */
	private static final String GROUP_DELIMITER = ":";
	/**
	 * Representation of the info delimiter symbol
	 */
	private static final String INFO_DELIMITER = " ";

	/**
	 * This function find appliances by correspond criteria
	 *
	 * @param 		criteria search params {@link Criteria}
	 * @return		appliance that meets the criteria
	 */
	@Override
	public Appliance find(Criteria criteria) {
		try {
			return getApplianceWithCriteria(criteria);
		} catch (IOException e) {
			System.out.println("Error: can't read the file");
			return null;
		}
	}

	private Appliance getApplianceWithCriteria(Criteria criteria) throws IOException {
		Map<String, List<String>> groupedAppliances = getGroups();
		if (groupedAppliances.containsKey(criteria.getGroupSearchName())) {
			return new Appliance(getCorrespondLines(criteria, groupedAppliances));
		} else {
			return null;
		}
	}

	private List<String> getCorrespondLines(Criteria criteria, Map<String, List<String>> groupedAppliances) {
		List<String> resultAppliances = new ArrayList<>();
		for (String groupItem : groupedAppliances.get(criteria.getGroupSearchName())) {
			if (checkCriteria(criteria, groupItem)) {
				resultAppliances.add(groupItem.substring(0, groupItem.length() - 1));
			}
		}
		return resultAppliances;
	}

	private boolean checkCriteria(Criteria criteria, String groupItem) {
		for (String criteriaValue : getCriteriaStrings(criteria)) {
			if (!groupItem.contains(criteriaValue)) {
				return false;
			}
		}
		return true;
	}

	private List<String> getCriteriaStrings(Criteria criteria) {
		List<String> criteriaStrings = new ArrayList<>();
		Map<String, Object> criteriaValues = criteria.getCriteria();
		for (String criteriaName : criteriaValues.keySet()) {
			criteriaStrings.add(criteriaName + "=" + criteriaValues.get(criteriaName).toString());
		}
		return criteriaStrings;
	}

	private static Map<String, List<String>> getGroups() throws IOException {
		Map<String, List<String>> groups = new HashMap<>();
		for (String line : readLines()) {
			processGroup(groups, line);
		}
		return groups;
	}

	private static void processGroup(Map<String, List<String>> groups, String line) {
		String[] groupDivision = line.split(GROUP_DELIMITER);
		if (groups.containsKey(groupDivision[0])) {
			groups.get(groupDivision[0]).add(groupDivision[1]);
		} else {
			addNewGroup(groups, groupDivision);
		}
	}

	private static void addNewGroup(Map<String, List<String>> groups, String[] groupDivision) {
		List<String> applianceContainer = new ArrayList<>();
		applianceContainer.add(groupDivision[1]);
		groups.put(groupDivision[0], applianceContainer);
	}

	private static List<String> readLines() throws IOException {
		Stream<String> linesStream = Files.lines(Path.of(FILE_PATH));
		return linesStream
				.map(line -> String.join( "",line.split(INFO_DELIMITER)))
				.filter(line -> !line.equals(""))
				.collect(Collectors.toList());
	}
}