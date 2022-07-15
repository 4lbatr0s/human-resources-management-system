package coding.hrms.business.verifications.concretes;

import coding.hrms.business.utils.constants.Messages;
import coding.hrms.business.verifications.abstracts.SystemUserVerificationService;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
public class SystemUserVerificationManager implements SystemUserVerificationService {
    @Override
    public Result verifyUser ( User user ) {
        //TODO: Replace it with real life application and EmailConfirms class instances.
        return new SuccessResult( Messages.UserVerifiedBySystemUser);
    }
}
