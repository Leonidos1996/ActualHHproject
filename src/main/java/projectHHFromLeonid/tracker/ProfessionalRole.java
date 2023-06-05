package projectHHFromLeonid.tracker;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROFESSIONALROLE")
public class ProfessionalRole {

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
    private boolean responseLetterRequired;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vacancies")
    private List<Vacancies> vacancies = new ArrayList<>();

}
