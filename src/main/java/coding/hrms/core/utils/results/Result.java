package coding.hrms.core.utils.results;


//INFO: Result is a super class


public class Result {

    private boolean success;
    private String message;

    public Result () {
    }

    public Result ( boolean success ) {
        this.success = success;
    }

    public Result ( boolean success, String message ) {
        this(success); //INFO: Makes the one parameter constructor works.
        this.message = message;
    }

    public boolean isSuccess () {
        return success;
    }


    public String getMessage () {
        return message;
    }


}
