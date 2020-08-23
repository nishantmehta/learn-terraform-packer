package application;

import config.DemoServerConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resource.DemoServerResource;

public class DemoServerApplication extends Application<DemoServerConfig> {

    @Override
    public void run(DemoServerConfig configuration, Environment environment) throws Exception {
        environment.jersey().register(new DemoServerResource());
    }
    public static void main(String args[]) throws Exception {
        new DemoServerApplication().run(args);
    }
}
