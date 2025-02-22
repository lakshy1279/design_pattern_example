package org.example.Tic_Tac_Toe.abstractFactory;



// this is Concrete Facotry which create Specific products.
public class DataBaseFactoryProducer {
    public static DatabaseFactory getFactory(String dbType) {
        if (dbType.equalsIgnoreCase("MySQL")) {
            return new MySqlFactory();
        } else if (dbType.equalsIgnoreCase("PostgreSQL")) {
            //return new PostgreSQLFactory();
        } else if (dbType.equalsIgnoreCase("Oracle")) {
            //return new OracleFactory();
        }
        return null;
    }
}
