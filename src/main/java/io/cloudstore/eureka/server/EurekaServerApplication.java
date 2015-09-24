package io.cloudstore.eureka.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

/**
 * @author chanwook
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
