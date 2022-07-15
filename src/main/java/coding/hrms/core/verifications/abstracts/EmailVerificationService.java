package coding.hrms.core.verifications.abstracts;

import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.User;

public interface EmailVerificationService extends VerificationService {
    Result verifyEmail( User user);
}
