package coding.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode //callSuper = false, default!
@Entity
@Data
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Employee extends User { //INFO: Not Id and others for extends from User.

    @NotBlank
    @Size(max = 35, min = 35)
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Size(min = 35, max = 35)
    @Column(name = "last_name")
    private String lastName;
}
