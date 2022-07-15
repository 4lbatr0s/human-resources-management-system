package coding.hrms.api.controllers;


import coding.hrms.business.abstracts.UserService;
import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import coding.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController  implements UserService {


    private final UserService _userService;

    //INFO: There are more than one UserService usage(probably due to User inheritence from Employee etc...
    // Therefore We're using @Qualifier annotation to clarify which SERVICE aka Manager we'd like to use!
    @Autowired
    public UserController ( @Qualifier("userManager") UserService userService ) {
        _userService = userService;
    }

    @Override
    @GetMapping("/getall")
    public DataResult<List<User>> getAll () {
        return this._userService.getAll();
    }

    @Override
    public DataResult<User> getById ( int id ) {
        return null;
    }

    @Override
    @PostMapping("/add")
    public Result add (@RequestBody User item ) {
        return null;
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
