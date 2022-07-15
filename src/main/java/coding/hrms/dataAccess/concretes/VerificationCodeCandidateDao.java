package coding.hrms.dataAccess.concretes;

import coding.hrms.entities.concretes.VerificationCodeCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeCandidateDao extends JpaRepository<VerificationCodeCandidate, Integer> {
}
