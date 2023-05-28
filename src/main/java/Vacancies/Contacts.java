package Vacancies;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CONTACTS")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String phones;

    @OneToMany
    private List<Vacancies> vacancies = new ArrayList<>();



}
