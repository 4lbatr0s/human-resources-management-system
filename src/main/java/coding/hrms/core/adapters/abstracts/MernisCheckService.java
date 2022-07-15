package coding.hrms.core.adapters.abstracts;

import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.Candidate;

public interface MernisCheckService {
    Result  checkIfPersonIsReal( Candidate candidate);
}
