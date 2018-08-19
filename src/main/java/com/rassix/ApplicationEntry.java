package com.rassix;

import com.rassix.controller.UserController;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationEntry extends Application<ApplicationConfig> {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationEntry.class);

    @Override
    public void run(ApplicationConfig applicationConfig, Environment environment) {
        logger.info("Registering REST endpoints");
        environment.jersey().register(new UserController(environment.getValidator()));
    }

    public static void main(String[] args) throws Exception {
        new ApplicationEntry().run(args);
    }
}
