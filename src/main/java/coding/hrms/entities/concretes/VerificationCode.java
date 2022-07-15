package coding.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "verification_codes")
@Data
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    @Column(name = "id")
    private int id;

//    @OneToOne(mappedBy = "verificationCode", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private VerificationCodeCandidate verificationCodeCandidate;

    @NotBlank
    @Size(min = 38, max = 38)
    @Column(name = "code")
    private String code;


    @NotEmpty
    @Column(name = "is_verified")
    private boolean isVerified;

    @Column(name = "verified_date")
    private Date verifiedDate;



    public int getId () {
        return id;
    }

    public String getCode () {
        return code;
    }

    public boolean isVerified () {
        return isVerified;
    }

    public Date getVerifiedDate () {
        return verifiedDate;
    }
}
