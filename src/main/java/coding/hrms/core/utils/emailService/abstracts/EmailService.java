package coding.hrms.core.utils.emailService.abstracts;

import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.User;

public interface EmailService {
    Result sendEmail( String email);
    Result checkIfEmailExists( User user);
}
