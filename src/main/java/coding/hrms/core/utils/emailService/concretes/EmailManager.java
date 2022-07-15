package coding.hrms.core.utils.emailService.concretes;

import coding.hrms.core.utils.emailService.abstracts.EmailService;
import coding.hrms.core.utils.results.ErrorResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.dataAccess.concretes.UserDao;
import coding.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailManager implements EmailService {

    private final UserDao _userDao;

    @Autowired
    public EmailManager ( UserDao userDao ) {
        _userDao = userDao;
    }

    @Override
    public Result sendEmail ( String email ) {
        return new SuccessResult(email);
    }


    //TODO: Change the verification system below
    //TODO: How?, 1.Send Email, 2.Simulate the email activation, 3.Create ValidationCode instance in the Database,
    // 4. Use the code below and verify Email address, 5. Save user.
    @Override
    public Result checkIfEmailExists ( User user ) {
        return new SuccessResult ();
//        var emailExists = this._userDao.findByEmail(user.getEmail ());
//        if(emailExists == null) {
//            return new ErrorResult ( );
//        }
//        return new SuccessResult();
    }


}
