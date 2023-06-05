package projectHHFromLeonid.tracker;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "METRO")
public class Metro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vacancies")
    private List<Address> addressList = new ArrayList<>();
}
