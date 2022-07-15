package coding.hrms.core.utils.results;


//INFO: generic class.
public class DataResult<T> extends Result{

    public T getData () {
        return data;
    }

    private T data; //INFO: Addition to success, and message, we now have a data property.

    //Info: the constructors below can be variated, it's up to developer.

    public DataResult () {
    }

    public DataResult ( boolean success ) {
        super ( success );
    }

    public DataResult ( boolean success, String message ) {
        super ( success, message );
    }

    public DataResult (T data, boolean success, String message ) {
        super ( success, message );
        this.data = data;
    }
    public DataResult ( T data, boolean success) {
        super ( success);
        this.data = data;
    }

    public DataResult ( T data) {
        this.data = data;
    }

}
