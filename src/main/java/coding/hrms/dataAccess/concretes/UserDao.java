package coding.hrms.dataAccess.concretes;

import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {
}
