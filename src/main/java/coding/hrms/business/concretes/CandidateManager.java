package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.CandidateService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.adapters.abstracts.MernisCheckService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.ErrorResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessDataResult;
import coding.hrms.core.verifications.abstracts.EmailVerificationService;
import coding.hrms.dataAccess.concretes.CandidateDao;
import coding.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private final CandidateDao _candidateDao;
    private final MernisCheckService _mernisCheckService;
    private final EmailVerificationService _emailVerificationService;

    @Autowired
    public CandidateManager ( CandidateDao candidateDao, MernisCheckService mernisCheckService, EmailVerificationService emailVerificationService ) {
        super();
        _candidateDao = candidateDao;
        _mernisCheckService = mernisCheckService;
        _emailVerificationService = emailVerificationService;
    }

    @Override
    public DataResult<List<Candidate>> getAll () {
        return new SuccessDataResult<List<Candidate>>(this._candidateDao.findAll (), Messages.CandidatesFetched);
    }

    @Override
    public DataResult<Candidate> getById ( int id ) {
        return null;
    }

    @Override
    public Result add ( Candidate candidate) {
        if(this._emailVerificationService.verifyEmail (candidate ).isSuccess ()){
            this._candidateDao.save(candidate);
            return new SuccessDataResult(Messages.CandidateCreated);
        } else {
            return new ErrorResult (Messages.CandidateCouldNotBeCreated);
        }
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<Candidate> update ( Candidate item ) {
        return null;
    }
}
