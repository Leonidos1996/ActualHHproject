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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String building;

    @Column
    private String city;

    //TODO: В One-To-Many не нужно добавлять аннотацию @JoinColumn
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    private List<Vacancies> vacancies = new ArrayList<>();

    //TODO: а в Many-To-ONE нужно добавлять аннотацию @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "metro_id")
    private Metro metro;
}
