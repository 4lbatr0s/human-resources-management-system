package coding.hrms.entities.concretes;


import coding.hrms.business.abstracts.VerificationCodeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode() //INFO:callSuper default false!
@Data
@Entity
@Table(name = "verification_codes_candidates")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class VerificationCodeCandidate {

    @Id
    @Column(name = "id")
    private int id;

//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "id")
//    private VerificationCode verificationCode;

    /*INFO:Finally, note in the next entity that we won't use the @JoinColumn annotation there.
        This is because we only need it on the owning side of the foreign key relationship.
        Simply put, whoever owns the foreign key column gets the @JoinColumn annotation.*/

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
//    private Candidate candidate;
}
