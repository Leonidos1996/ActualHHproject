package projectHHFromLeonid.tracker;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String building;

    @Column
    private String city;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vacancies")
    private List<Vacancies> vacancies = new ArrayList<>();

    @ManyToOne
    private Metro metro;
}
