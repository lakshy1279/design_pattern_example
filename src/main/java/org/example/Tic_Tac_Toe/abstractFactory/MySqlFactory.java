package org.example.Tic_Tac_Toe.abstractFactory;


// simlarliy we have other facotry also like oracle and many others
//Abstract Factory specializes in creating families of related objects.
public class MySqlFactory implements DatabaseFactory{
    public Connection createConnection() {
        return new MySqlConnection();
    }

    public Query createQuery() {
        return new MySQLQuery();
    }

    public Record createRecord() {
        return new MySQLRecord();
    }
}


