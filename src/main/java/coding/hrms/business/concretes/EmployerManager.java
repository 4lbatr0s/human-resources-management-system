package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.EmployerService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.business.verifications.abstracts.SystemUserVerificationService;
import coding.hrms.core.utils.results.*;
import coding.hrms.core.verifications.abstracts.EmailVerificationService;
import coding.hrms.dataAccess.concretes.EmployerDao;
import coding.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EmployerManager implements EmployerService {


    private final EmployerDao _employerDao;
    private final SystemUserVerificationService _systemUserVerificationService;

    private final EmailVerificationService _emailVerificationService;

    @Autowired
    public EmployerManager ( EmployerDao employerDao, SystemUserVerificationService systemUserVerificationService, EmailVerificationService emailVerificationService ) {
        _employerDao = employerDao;
        _systemUserVerificationService = systemUserVerificationService;
        _emailVerificationService = emailVerificationService;
    }

    @Override
    public DataResult<List<Employer>> getAll () {
        return new SuccessDataResult<List<Employer>> (this._employerDao.findAll (), Messages.AllEmployersFetched);
    }

    @Override
    public DataResult<Employer> getById ( int id ) {
        return null;
    }

    @Override
    public Result add ( Employer user ) {
        if(this._systemUserVerificationService.verifyUser (user).isSuccess () && this._emailVerificationService.verifyEmail ( user ).isSuccess () ){
            this._employerDao.save(user);
            return new SuccessResult (Messages.EmployerCreateed);
        } else {
            return new ErrorResult (Messages.EmployerCouldNotBeCreated);
        }
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<Employer> update ( Employer item ) {
        return null;
    }
}
