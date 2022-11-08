package wt.entity.criteria;

/**
 * Container for the group criteria names
 *
 * @author 		Pavel Shalyga
 * @version 	1.0
 */
public final class SearchCriteria {

    /**
     * Oven group criteria names
     */
    public enum Oven{
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    /**
     * Laptop group criteria names
     */
    public enum Laptop{
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
    }

    /**
     * Refrigerator group criteria names
     */
    public enum Refrigerator{
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    /**
     * Vacuum Cleaner group criteria names
     */
    public enum VacuumCleaner{
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    /**
     * Tablet PC group criteria names
     */
    public enum TabletPC{
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    /**
     * Speakers group criteria names
     */
    public enum Speakers{
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
    }

    /**
     * Constructor for the search criteria
     */
    private SearchCriteria() {}
}
