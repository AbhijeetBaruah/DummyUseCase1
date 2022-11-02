public class Service {
    private RepoClass repo;//some repository class/interface needs to be build to interact with database
    private QueryBuilder queryBuilder;
    public String postQuery(Request request) {
        private Query query = request.query;
        String dbQuery = queryBuilder.post(request);
        try {
            repo.post(dbQuery);
        } catch(Exception ex) {
            log.info(ex);
            return "Ho gya satyanash:"+ex.message();
        }
        return "success";
    }
}