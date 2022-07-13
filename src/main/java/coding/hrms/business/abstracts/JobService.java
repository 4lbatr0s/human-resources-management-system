package coding.hrms.business.abstracts;

import coding.hrms.entities.concretes.Job;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JobService {
    List<Job> GetAll();
}
