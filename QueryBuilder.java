public class QueryBuilder {
    
    public QueryBuilder(){}
    public String post(Request request) {
        
        switch(request.operator) {
            case "AND":
                return andQuery(request);
            case "OR":
                return orQuery(request);
            case "IN":
                return inQuery(request);
        }

    }
    private String andQuery(Request request) {
        //sqlInjection sensitive so use better library methods
        String query = "SELECT * FROM DUAL WHERE ";
        Value[] value = request.getQuery().getValue();
        String next = null;
        for(int i=0;i<value.length();i++){
            next = next+value[i].getField()+" "+value[i].getOperator()+" "+value[i].getValue();
            if(i++<value.length()) {
                next = next+" "+request.getQuery().getOperator();
            }
        }
        return query+next+";"
    }
    private String orQuery(Request request) {
        ...
    }
    private String inQuery(Request request) {
        ...
    }

}