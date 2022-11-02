public class Request {
    private Query query;
    private Pagination pagination;
    public Request() {
    }
    //build getters 
    boolean isValid(){
        return this.query.isValid(); //apply checkers according to requirement
    }
}
class Query {
    private String operator;
    private Value[] value;
    public Query() {
    }
    //build getters and setters
    public boolean isValid(){
        //we can add logs here
        return (this.operator ==null || this.operator.trim().isEmpty() || 
                !this.operator.isOperatorValid() || this.value.length()==0 || 
                !this.isValueArrayValid() )?false:true;
    }
    private boolean isValueArrayValid(){
        for(Value x:this.value){
            if(!x.isValid()) {
                return false;
            }

        }
        return true;
    }
    private boolean isOperatorValid(){
        private Operator operator;
        switch(this.operator.trim().toUpperCase()) {
            //front end me standardise krna pdega which symbol is for what....
            case "&&":
                this.setOperator(operator.getAnd());
                return true;
            case "AND":
                this.setOperator(operator.getAnd());
                return true;
            case "||":
                this.setOperator(operator.getOr());
                return true;
            case "OR":
                this.setOperator(operator.getOr());
                return true;
            case "CONTAINS_IN":
                this.setOperator(operator.getIn());
                return true;                                  
            case "IN":
                this.setOperator(operator.getIn());
                return true; 
            default:
                return false;
        }
    }
}
class Value {
    private String field;
    private String operator;
    private String value;
    public Value() {
    }
    public boolean isValid() {
        if(this.field ==null || this.field.trim().isEmpty() || 
            this.operator ==null || operator.trim().isEmpty() ||
            this.value ==null || this.value.trim().isEmpty())
            return false;
        this.field = this.field.trim();
        this.operator = this.operator.trim();
        this.value = this.value.trim();
        return true;
    }

}
class Pagination {
    private int per_page;
    public Pagination(){}
}