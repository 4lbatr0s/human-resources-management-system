package coding.hrms.business.verifications.abstracts;

import coding.hrms.core.utils.results.Result;
import coding.hrms.core.verifications.abstracts.VerificationService;
import coding.hrms.entities.concretes.User;

public interface SystemUserVerificationService extends VerificationService {
    Result verifyUser( User user);
}
