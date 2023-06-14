package projectHHFromLeonid.tracker.dao.interfaces;

import org.springframework.data.repository.CrudRepository;
import projectHHFromLeonid.tracker.entity.Salary;

public interface SalaryRepo extends CrudRepository<Salary, Integer> {
    //отвечает работу с БД

}
