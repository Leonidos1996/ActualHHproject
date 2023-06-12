package JdbcTemplate;

import org.springframework.stereotype.Service;

@Service
public class SalaryRepoImplPostgre implements SalaryDataBaseRepo {
    @Override
    public void putToDatabase() {
        System.out.println("Кладем в постгре");
    }
}
