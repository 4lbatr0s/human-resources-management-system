package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.VerificationCodeService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessDataResult;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.dataAccess.concretes.VerificationCodeDao;
import coding.hrms.entities.concretes.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VerificationCodeManager implements VerificationCodeService {


    private final VerificationCodeDao _verificationCodeDao;

    @Autowired
    public VerificationCodeManager ( VerificationCodeDao verificationCodeDao ) {
        _verificationCodeDao = verificationCodeDao;
    }

    @Override
    public DataResult<List<VerificationCode>> getAll () {
        return new SuccessDataResult<List<VerificationCode>> (this._verificationCodeDao.findAll (), Messages.AllVerificationCodesFetched);
    }

    @Override
    public DataResult<VerificationCode> getById ( int id ) {
        return null;
    }

    @Override
    public Result add ( VerificationCode item ) {
        this._verificationCodeDao.save(item);
        return new SuccessResult(Messages.VerificationCodeCreated);
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<VerificationCode> update ( VerificationCode item ) {
        return null;
    }
}
