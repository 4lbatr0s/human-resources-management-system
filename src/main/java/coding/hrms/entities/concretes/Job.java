package coding.hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_titles")
@Data //lombok, getter setter and constructor
public class Job {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;
}
