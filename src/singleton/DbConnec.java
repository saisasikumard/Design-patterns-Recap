package singleton;

public class DbConnec extends  MyClone{
    private static DbConnec dbConnec = null;

    private DbConnec() {

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    public static DbConnec getInstance() {
        if (dbConnec == null) {
            synchronized (DbConnec.class) {
                if (dbConnec == null) {
                    dbConnec = new DbConnec();
               }
            }
        }
        return dbConnec;
    }
}