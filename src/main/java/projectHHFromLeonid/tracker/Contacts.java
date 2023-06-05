package projectHHFromLeonid.tracker;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "CONTACTS")
public class Contacts {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private Integer id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private int phone;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vacancies")
    private List<Vacancies> vacancies = new ArrayList<>();



}
