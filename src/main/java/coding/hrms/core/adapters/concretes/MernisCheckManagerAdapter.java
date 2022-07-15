package coding.hrms.core.adapters.concretes;

import coding.hrms.core.adapters.abstracts.MernisCheckService;
import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MernisCheckManagerAdapter implements MernisCheckService {


    @Override //TODO: There is a problem with the MERNIS microservice, MernisMicroService will be implemented once it's handled properly.
    public Result checkIfPersonIsReal ( Candidate candidate ) {
        return null;
    }
}
