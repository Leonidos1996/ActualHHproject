package Vacancies;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CONTACTS")
public class Professional_role {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Integer published;

    @Column
    private String relation;

    @Column
    private String response_letter_required;

    @OneToMany
    private List<Vacancies> vacancies = new ArrayList<>();

}
