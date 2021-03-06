package coding.hrms.api.controllers;

import coding.hrms.business.abstracts.JobService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    private final JobService _jobService;


    @Autowired
    public JobsController ( JobService jobManager ) {
        _jobService = jobManager;
    }


    @GetMapping("/getall")
    public DataResult<List<Job>> GetAll () {
        return this._jobService.getAll ();
    }

}
