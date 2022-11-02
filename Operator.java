public class Operator {
    private String and;
    private String in;
    private String or;

    public Operator(){
        and='AND';
        contains='IN';
        or='||';
    }
    String getAnd(){
        return this.and;
    }
    String getIN() {
        return this.in;
    }
    String getOr() {
        return this.or;
    }

}