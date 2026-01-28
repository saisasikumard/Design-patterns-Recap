package singleton;

public class DbConnec {
    private static DbConnec dbConnec = null;

    private DbConnec() {

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