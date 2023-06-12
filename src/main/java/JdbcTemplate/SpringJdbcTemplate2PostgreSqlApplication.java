package JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import projectHHFromLeonid.tracker.Salary;


@EntityScan("projectHHFromLeonid.tracker")
@EnableJpaRepositories
@SpringBootApplication
public class SpringJdbcTemplate2PostgreSqlApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired //Инжектим зависимости
    private SalaryRepo salaryRepo;

//    @Qualifier("mongo")
//    @Autowired
//    private SalaryDataBaseRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcTemplate2PostgreSqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        String sql = "INSERT INTO salary (summ) VALUES ("
//                + "'99939')";
//
//        int rows = jdbcTemplate.update(sql);
//        if (rows > 0) {
//            System.out.println("A new row has been inserted.");
//        }


        Salary salary = new Salary();
        salary.setSumm(1231);
        salaryRepo.save(salary); //закоммиченный с 35-41 строчку



    }

}