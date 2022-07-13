package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.JobService;
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
    public List<Job> GetAll () {
        return this._jobDao.findAll ();
    }
}
