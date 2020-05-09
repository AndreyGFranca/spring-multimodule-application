package io.github.andreygfranca.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"io.github.andreygfranca.repository"})
@EnableJpaRepositories(basePackages = {"io.github.andreygfranca.repository"})
public class PersistenceModule {
}
