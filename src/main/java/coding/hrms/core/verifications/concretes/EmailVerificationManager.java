package coding.hrms.core.verifications.concretes;


import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.emailService.abstracts.EmailService;
import coding.hrms.core.utils.results.ErrorResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.core.verifications.abstracts.EmailVerificationService;
import coding.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailVerificationManager implements EmailVerificationService {

    private final EmailService _emailService;

    @Autowired
    public EmailVerificationManager ( EmailService emailService ) {
        _emailService = emailService;
    }



    @Override
    public Result verifyEmail ( User user ) {
//     TODO: Change the verification system below.
        //TODO: How?, 1.Send Email, 2.Simulate the email activation, 3.Create ValidationCode instance in the Database,
        // 4. Use the code below and verify Email address, 5. Save user.
        //TODO: For now, checkIfEmailExist() function always returns true.
        if(_emailService.checkIfEmailExists ( user ).isSuccess ())
            return new SuccessResult( Messages.EmailVerificated + user.getEmail () );
        return new ErrorResult (Messages.EmailCouldNotVerified);
    }
}
