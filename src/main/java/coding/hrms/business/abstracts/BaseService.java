package coding.hrms.business.abstracts;

import coding.hrms.core.utils.results.DataResult;
import coding.hrms.core.utils.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BaseService<T> {
    DataResult<List<T>> getAll();
    DataResult<T> getById(int id);
    Result add(T item);
    Result delete(int id);
    DataResult<T> update(T item);
}
