package projectHHFromLeonid.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import projectHHFromLeonid.tracker.dao.interfaces.SalaryRepo;
import projectHHFromLeonid.tracker.entity.Salary;


@EntityScan("projectHHFromLeonid.tracker.entity")
@EnableJpaRepositories
@SpringBootApplication
public class SpringJdbcTemplate2PostgreSqlApplication implements CommandLineRunner {

    @Autowired //Инжектим зависимости
    private SalaryRepo salaryRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcTemplate2PostgreSqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Salary salary = new Salary();
        salary.setSumm(1231);
        salaryRepo.save(salary);

    }

}