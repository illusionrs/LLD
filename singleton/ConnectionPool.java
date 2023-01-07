
class ConnectionPool {

    private static ConnectionPool instance = null;

    private ConnectionPool(){}


    public static ConnectionPool getInstance(){
            if(instance==null)
            instance =  new ConnectionPool();

            return instance;
    }
}