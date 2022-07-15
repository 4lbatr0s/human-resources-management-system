package coding.hrms.api.controllers;

import coding.hrms.business.abstracts.VerificationCodeService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodes")
public class VerificationCodeController implements  BaseController<VerificationCode>{

    private final VerificationCodeService _verificationCodeService;


    @Autowired
    public VerificationCodeController ( VerificationCodeService verificationCodeService ) {
        _verificationCodeService = verificationCodeService;
    }


    @Override
    public DataResult<List<VerificationCode>> getAll () {
        return null;
    }

    @Override
    public DataResult<VerificationCode> getById ( int id ) {
        return null;
    }

    @Override
    @PostMapping("/add")
    public Result add ( VerificationCode item ) {
        return this._verificationCodeService.add( item );
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
