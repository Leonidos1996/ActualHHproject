package JdbcTemplate;

import org.springframework.data.repository.CrudRepository;
import projectHHFromLeonid.tracker.Salary;

public interface SalaryRepo extends CrudRepository<Salary, Integer> {
    //отвечает работу с БД

}
