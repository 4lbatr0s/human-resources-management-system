package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.VerificationCodeCandidateService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessDataResult;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.dataAccess.concretes.VerificationCodeCandidateDao;
import coding.hrms.entities.concretes.VerificationCode;
import coding.hrms.entities.concretes.VerificationCodeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {

    @Autowired
    private final VerificationCodeCandidateDao _verificationCodeCandidateDao;

    public VerificationCodeCandidateManager ( VerificationCodeCandidateDao verificationCodeCandidateDao ) {
        _verificationCodeCandidateDao = verificationCodeCandidateDao;
    }

    @Override
    public DataResult<List<VerificationCodeCandidate>> getAll () {
        return new SuccessDataResult<List<VerificationCodeCandidate>> (this._verificationCodeCandidateDao.findAll (), Messages.AllVerificationCodesCandidatesFetched);
    }

    @Override
    public DataResult<VerificationCodeCandidate> getById ( int id ) {
        return null;
    }

    @Override
    public Result add ( VerificationCodeCandidate item ) {
        this._verificationCodeCandidateDao.save(item);
        return new SuccessResult (Messages.VerificationCodeCandidateCreated);
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<VerificationCodeCandidate> update ( VerificationCodeCandidate item ) {
        return null;
    }
}
