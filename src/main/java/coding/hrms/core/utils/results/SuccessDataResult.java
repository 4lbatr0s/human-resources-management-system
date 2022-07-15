package coding.hrms.core.utils.results;

import javax.xml.crypto.Data;

public class SuccessDataResult<T> extends DataResult<T> {


    public SuccessDataResult () {
        super ( true );
    }

    public SuccessDataResult (String message ) {
        super ( true, message );
    }

    public SuccessDataResult ( T data, String message ) {
        super ( data,true, message );
    }

    public SuccessDataResult ( T data) {
        super ( data, true );
    }

}



