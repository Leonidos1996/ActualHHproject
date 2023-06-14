package projectHHFromLeonid.tracker.dao.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projectHHFromLeonid.tracker.dao.interfaces.SalaryDataBaseRepo;

@Configuration
public class SalaryRepoConfig {
    @Bean(name = "postgre")
    public SalaryDataBaseRepo getPostgre() {
        SalaryDataBaseRepo repo = new SalaryRepoImplPostgre();
        return repo;
    }

    @Bean(name = "mongo")
    public SalaryDataBaseRepo getMongo() {
        SalaryDataBaseRepo repo = new SalaryRepoImplMongo();
        return repo;
    }
}
