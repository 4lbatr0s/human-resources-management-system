package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.EmployeeService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessDataResult;
import coding.hrms.core.utils.results.SuccessResult;
import coding.hrms.dataAccess.concretes.EmployeeDao;
import coding.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

   private final EmployeeDao _employeeDao;

   @Autowired
    public EmployeeManager ( EmployeeDao employeeDao ) {
        _employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll () {
        return new SuccessDataResult<List<Employee>>(this._employeeDao.findAll(), Messages.AllEmployeesListed);
    }

    @Override
    public DataResult<Employee> getById ( int id ) {
        return null;
    }

    @Override
    public Result add ( Employee item ) {
        this._employeeDao.save(item);
        return new SuccessResult();
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
