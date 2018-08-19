package com.rassix;

import com.rassix.controller.UserController;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationEntry extends Application<ApplicationConfig> {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationEntry.class);

    public static void main(String[] args) throws Exception {
        new ApplicationEntry().run(args);
    }

    @Override
    public void initialize(Bootstrap<ApplicationConfig> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<ApplicationConfig>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(ApplicationConfig configuration) {
                return configuration.getSwaggerBundleConfiguration();
            }
        });
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
    }

    @Override
    public void run(ApplicationConfig applicationConfig, Environment environment) {
        logger.info("Registering REST endpoints");
        environment.jersey().register(new UserController(environment.getValidator()));
    }

}
