package coding.hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "job_titles")
@Data //lombok, getter setter and constructor
public class Job {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


    @NotBlank
    @Column(name = "title")
    private String title;
}
