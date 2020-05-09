package io.github.andreygfranca.application;

import io.github.andreygfranca.domain.DomainModule;
import io.github.andreygfranca.repository.PersistenceModule;
import io.github.andreygfranca.service.ServiceModule;
import io.github.andreygfranca.web.WebModule;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringMultimoduleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DomainModule.class,
                        PersistenceModule.class,
                        ServiceModule.class,
                        WebModule.class)
                .run(args);
    }

}
