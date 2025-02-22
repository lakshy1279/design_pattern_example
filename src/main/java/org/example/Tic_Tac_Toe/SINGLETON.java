package org.example.Tic_Tac_Toe;

public class SINGLETON {
    // different methods of singleton
    // 1. eager intialisation
    // disadvantage is object created even if not getting used.
    public static class DBConnection {
        private static DBConnection instance = new DBConnection();
        private DBConnection() {

        }
        public static DBConnection getInstance() {
            return instance;
        }
    }
    //2. lazy intitalisation
    public static class DBConnection1 {
        //also there is issue when thread running on diff core then thread first update their cache then memory
        //private static DBConnection1 instance;

        // volatile keyword solve this issue as it is directly read and write from memory
        private static volatile DBConnection1 instance;

        private DBConnection1() {

        }
        // not thread safe
        public static DBConnection1 getInstance() {
           if(instance == null) {
               instance = new DBConnection1();
           }
           return instance;
        }

        // very slow because only one thread enter inside the block even if the object get created
        synchronized public static DBConnection1 getInstance1() {
            if(instance == null) {
                instance = new DBConnection1();
            }
            return instance;
        }

        //double check locking
        // little bit slow due to volatile and sync keyword.
        public static DBConnection1 getInstance3() {
            if(instance == null) {
                synchronized (DBConnection1.class) {
                    if(instance == null) {
                        instance = new DBConnection1();
                    }
                }
            }
            return instance;
        }
    }

    //3. Bill pough solution
    public static class DBConnection2 {
        private DBConnection2() {
        }

        // object only created when needed
        private static class DBConnectionHelper {
            private static final DBConnection instance = new DBConnection();
        }

        public static DBConnection getInstance() {
            return DBConnectionHelper.instance;
        }
    }
}
