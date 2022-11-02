import Dummy.Request;
import Dummy.Operator;

public class Validator {
    private Operator operator;
    public Validator() {}
    boolean isPostRequestValid(Request request) {
        if(request.query.isValid()) {
            return true;
        }
        return false;
    }
    
    //here you can add more validators in future specific to the request

}