package projectHHFromLeonid.tracker;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "SALARY")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private int summ;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vacancies")
    private List<Vacancies> vacancies = new ArrayList<>();


}
