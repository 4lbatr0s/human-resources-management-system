package coding.hrms.dataAccess.concretes;

import coding.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}
