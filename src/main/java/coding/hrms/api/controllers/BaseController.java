package coding.hrms.api.controllers;

import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface BaseController<T> {

    DataResult<List<T>> getAll();
    DataResult<T> getById(int id);
    Result add( T item);
    Result delete(int id);
    DataResult<T> update(T item);
}
