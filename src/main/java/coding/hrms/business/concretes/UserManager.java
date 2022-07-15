package coding.hrms.business.concretes;

import coding.hrms.business.abstracts.UserService;
import coding.hrms.business.utils.constants.Messages;
import coding.hrms.core.utils.results.*;
import coding.hrms.dataAccess.concretes.UserDao;
import coding.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserManager implements UserService {

    private final UserDao _userDao;

    @Autowired
    public UserManager ( UserDao userDao ) {
        _userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll () {
        return new SuccessDataResult<List<User>> (this._userDao.findAll (), Messages.AllUsersListed);
    }

    @Override
    public DataResult<User> getById ( int id ) {
        return null;
    }

    @Override
    public Result add (@RequestBody  User item ) {
        try {
            this._userDao.save ( item );
            return new SuccessDataResult(Messages.UserCreated);
        } catch (Exception e) {
            return new ErrorResult (e.getMessage ());
        }
    }

    @Override
    public Result delete ( int id ) {
        return null;
    }

    @Override
    public DataResult<User> update ( User item ) {
        return null;
    }


}
