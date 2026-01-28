import singleton.DbConnec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DbConnec db1=DbConnec.getInstance();
        DbConnec db2=DbConnec.getInstance();
        System.out.println(db1.hashCode());
        System.out.println(db2.hashCode());
        }
    }
