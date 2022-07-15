package coding.hrms.api.controllers;


import coding.hrms.business.abstracts.EmployeeService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController implements  BaseController<Employee>{


    private final EmployeeService _employeeService;

    @Autowired
    public EmployeeController ( EmployeeService employeeService ) {
        _employeeService = employeeService;
    }

    @Override
    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll () {
        return _employeeService.getAll();
    }

    @Override
    public DataResult<Employee> getById ( int id ) {
        return null;
    }

    @Override
    @PostMapping("/create")
    public Result add (@RequestBody  Employee item ) {
        this._employeeService.add(item);
        return new SuccessResult(Messages.EmployeeCreated);
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<Employee> update ( Employee item ) {
        return null;
    }
}
