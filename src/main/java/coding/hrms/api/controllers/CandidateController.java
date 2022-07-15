package coding.hrms.api.controllers;

import coding.hrms.business.abstracts.CandidateService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController implements  BaseController<Candidate> {

    private final CandidateService _candidateService;

    @Autowired
    public CandidateController ( CandidateService candidateService ) {
        _candidateService = candidateService;
    }

    @Override
    @GetMapping("/getall")
    public DataResult<List<Candidate>> getAll () {
        return this._candidateService.getAll();
    }

    @Override
    public DataResult<Candidate> getById ( int id ) {
        return null;
    }

    @Override
    @PostMapping("/add")
    public Result add (@RequestBody Candidate item ) {
        return this._candidateService.add ( item );
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
