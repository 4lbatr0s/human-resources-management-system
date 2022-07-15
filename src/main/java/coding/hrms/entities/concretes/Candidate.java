package coding.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode //callSuper = false, default!
@Entity
@Data
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Candidate extends User {

    @NotBlank //INFO:For a string: MUST BE NOT NULL, NOT EMPTY AND NOT BLANK.
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Size(min = 11, max = 11)
    @Column(name = "identity_number")
    private int identityNumber;

    @NotEmpty //INFO: Cannot use NotBlank here because  it is not supported  in the non-string values.
    @Column(name = "birth_year")
    private int birthYear;
//
//    @OneToOne(mappedBy = "candidate", cascade = CascadeType.ALL) //INFO: mappedBy "candidate" because our variable name in the VerificationCodeCandidate class is candidate.
//    private VerificationCodeCandidate verificationCodeCandidate;
}

