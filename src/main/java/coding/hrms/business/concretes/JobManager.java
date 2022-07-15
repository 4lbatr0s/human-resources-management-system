package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.JobService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.core.utils.results.SuccessDataResult;
import coding.hrms.dataAccess.concretes.JobDao;
import coding.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private final JobDao _jobDao;


    @Autowired
    public JobManager ( JobDao jobDao ) {
        _jobDao = jobDao;
    }


    @Override
    public DataResult<List<Job>> getAll () {
        return new SuccessDataResult<List<Job>> (this._jobDao.findAll (), "Jobs fetched successfully");
    }

    @Override
    public DataResult<Job> getById ( int id ) {
        return null;
    }

    @Override
    public Result add ( Job item ) {
        return null;
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<Job> update ( Job item ) {
        return null;
    }
}
