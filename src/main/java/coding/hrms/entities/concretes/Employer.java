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

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode //callSuper = false, default!
@Entity
@Data
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")

public class Employer extends User {


    @NotBlank
    @Column(name = "company_name")
    private String companyName;

    @NotBlank
    @Column(name = "web_adress")
    private String webAddress;

    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;
}
