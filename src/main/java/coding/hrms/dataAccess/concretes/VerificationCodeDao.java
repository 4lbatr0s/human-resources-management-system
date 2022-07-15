package coding.hrms.dataAccess.concretes;

import coding.hrms.entities.concretes.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer> {
}
