
import Dummy.Validator;

public class DataHandleController {
    
    private Validator validator;
    private Service service;

    
    @PostMapping("/api/frame")
    public String postAPi(@RequestBody Request request) {
        if(!validator.isPostRequestValid(request)) return "beta Data sahi dede";
        ...
        //once its verified that required fields are present and correct..create query as per
        // requirement
        //in service class or file
        return service.postQuery(request);

    }
}