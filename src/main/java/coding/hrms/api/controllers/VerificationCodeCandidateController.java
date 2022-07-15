package coding.hrms.api.controllers;

import coding.hrms.business.abstracts.VerificationCodeCandidateService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.VerificationCodeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/verificationCodeCandidates")
public class VerificationCodeCandidateController implements BaseController<VerificationCodeCandidate> {

    private final VerificationCodeCandidateService _verificationCodeCandidateService;


    @Autowired
    public VerificationCodeCandidateController ( VerificationCodeCandidateService verificationCodeCandidateService ) {
        _verificationCodeCandidateService = verificationCodeCandidateService;
    }


    @Override
    @GetMapping("/getall")
    public DataResult<List<VerificationCodeCandidate>> getAll () {
        return this._verificationCodeCandidateService.getAll ();
    }

    @Override
    public DataResult<VerificationCodeCandidate> getById ( int id ) {
        return null;
    }

    @Override
    @PostMapping("/add")
    public Result add (@RequestBody VerificationCodeCandidate item ) {
        return this._verificationCodeCandidateService.add ( item );
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
