package wt.service;

import wt.service.impl.ApplianceServiceImpl;

/**
 * This class represent factory for all existing services
 */
public final class ServiceFactory {
    /**
     * This field represents factory instance
     */
    private static final ServiceFactory instance = new ServiceFactory();
    /**
     * This field represents appliance service implementation
     */
    private final ApplianceService applianceService;

    /**
     * Constructor for the factory object
     */
    private ServiceFactory() {
        this.applianceService = new ApplianceServiceImpl();
    }

    /**
     * Simple factory instance getter
     *
     * @return requested factory object
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

    /**
     * Appliance service getter
     *
     * @return appliance service implementation
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }
}
