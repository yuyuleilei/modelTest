package com.yl.model.core.common.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/13
 * @description
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    private String url = "";
    private String username = "";
    private String password = "";
    private String driverClassName = "";

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection connection = null;

    private ConnectionPool(){
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++){
            try{
                Class.forName(driverClassName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void release(){
        pool.add(connection);
    }

    public synchronized Connection getConnection(){
        if(pool.size() > 0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else{
            return null;
        }
    }

}
