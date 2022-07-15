package coding.hrms.api.controllers;

import coding.hrms.business.abstracts.EmployerService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployerController implements  BaseController<Employer>{

    private final EmployerService _employerService;

    @Autowired
    public EmployerController ( EmployerService employerService ) {
        _employerService = employerService;
    }

    @Override
    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll () {
        return this._employerService.getAll();
    }

    @Override
    public DataResult<Employer> getById ( int id ) {
        return null;
    }

    @Override
    @PostMapping("/add")
    public Result add (@RequestBody Employer item ) {
        return this._employerService.add ( item );
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
