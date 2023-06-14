package projectHHFromLeonid.tracker.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "CONTACTS")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private int phone;

    //TODO: В One-To-Many не нужно добавлять аннотацию @JoinColumn
    @OneToMany(fetch = FetchType.LAZY)
    private List<Vacancies> vacancies = new ArrayList<>();

}
