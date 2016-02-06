package core.mySql;

import core.constans.Constans;

import java.sql.*;

/**
 * Created by sergey on 2/3/16.
 */
public class DBUtils {
    //JDBC driver name and database URL
    static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1";

    //Database credentials
    Constans constans = new Constans();


    Connection conn = null;
    Statement stmt = null;

    ResultSet rs = null;


    /**
     * @Method connect to DB
     */

    public void connectToDB() {
        //Register JDBC Driver
        try {
            Class.forName(JDBC_Driver);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        //Open a connection
        System.out.println("connecting to DB");
        try {
            conn = DriverManager.getConnection(DB_URL, constans.DB_USER, constans.DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Method close connect to DB
     * */
    public void closeConnectToDB() throws SQLException {
        rs.close();
        stmt.close();
        conn.close();
    }

    /**
     * @Method insert data in table
     * */

    public void insertDataInTable() {
        System.out.println("creating statement...");
        try {
                stmt = conn.createStatement();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        String sql;
        sql = "SELECT email FROM erise.testUsers";
        try {
                rs = stmt.executeQuery(sql);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
    }

    /**
     * @Method select data from DB
     * */
    public void selectDataFromDB() throws SQLException {
        while(rs.next()){
            //Retrieve by column name
            String email = rs.getString("first");
            String last = rs.getString("last");

            //Display values;
            System.out.println("email" + email);
        }
    }
}






    /**
     * @Method for insert User in to table
     * */
//    public void connect() {
//        try{
//            //Register JDBC Driver
//            try {
//                Class.forName(JDBC_Driver);
//            } catch (ClassNotFoundException e1) {
//                e1.printStackTrace();
//            }
//
//            //Open a connection
//            System.out.println("connecting to DB");
//            try {
//                conn = DriverManager.getConnection(DB_URL, constans.DB_USER, constans.DB_PASS);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }




            //Execute a query
//            System.out.println("creating statement...");
//            try {
//                  = conn.createStatement();
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }
//            String sql;
//            sql = "SELECT email FROM erise.testUsers";
//            ResultSet rs = null;
//            try {
//                rs = stmt.executeQuery(sql);
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }

            //Extract data from result set
//            try {
//                while (rs.next()) {
//                    //Retrive by column name
//                    String email = rs.getString("email");
//
//                    //Display Values
//                    System.out.println("email " + email);

                    //clean-up environment
//                    rs.close();
//                    stmt.close();
//                    conn.close();
//                }
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }
//        } finally {
//            //finally block used to close resources
//            try{
//                if(stmt!=null)
//                    stmt.close();
//            }catch(SQLException se2){
//            }// nothing we can do
//            try{
//                if(conn!=null)
//                    conn.close();
//            }catch(SQLException se){
//                se.printStackTrace();
//            }
//        }
//    }
