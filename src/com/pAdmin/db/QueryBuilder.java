package com.pAdmin.db;

import java.sql.Connection;

/**
 * Created by neeraj on 11/25/2016.
 */
public class QueryBuilder {
    // build queries here
    // used for both remote and local queries to database
    // This class also provide universal connection for database

    private DBHandler db;
    public static Connection connection;

    public QueryBuilder(){
        db = new DBHandler("sqlite");
        connection = db.connectSqlite("db://db.sqlite");
    }

    public boolean checkUser(){
        // query database and fetch results
        return false;
    }

    public boolean addUser(String username, String password){
        // Insert into users values (username, password)

        return false;
    }

    public boolean addCriminal(){

        return false;
    }

    public boolean checkCriminal(){
         return false;
    }
}
