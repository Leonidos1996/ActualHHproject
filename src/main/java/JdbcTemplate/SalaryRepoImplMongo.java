package JdbcTemplate;

import org.springframework.stereotype.Service;

@Service
public class SalaryRepoImplMongo implements SalaryDataBaseRepo{


    @Override
    public void putToDatabase() {
        System.out.println("Кладем Монго");
    }


}
