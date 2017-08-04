package se.klartext.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by suchuan on 2017-05-20.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("se.klartext.app.data.api")
@EnableJpaAuditing
public class PersistenceConifg {
}
