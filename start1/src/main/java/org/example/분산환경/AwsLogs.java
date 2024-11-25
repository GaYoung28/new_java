package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AwsLogs {
    //MYSQL JDBC URI
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    //MongoDB Connection URI
    private static final String MONGO_URI = "mongodb://localhost:27017";

    public static void main(String[] args) {
        try {
            //1. mysql연결
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mysqlConnection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("Connected to MySQL");

            //2. 회원가입 후 자동증가한 id를 얻어오자.
            // MySQL에 INSERT data
            String insertUserSQL = "Insert into users(name, email) values(?,?)";
            PreparedStatement pstmt = mysqlConnection.prepareStatement(insertUserSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setString (1,"hong");
            pstmt.setString (2,"hong@new.com");
            pstmt.executeUpdate();


            //3. 2번에서 얻은 id를 이용해서 몽고db에 주문정보 넣기
            ResultSet rs = pstmt.getGeneratedKeys();
            int userId = 0;
            if(rs.next()) {
                userId = rs.getInt(1);
            }
            System.out.println(userId);


            // 3-1 몽고db 연결
            MongoClient client = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = client.getDatabase("aws");
            MongoCollection<Document> logCollection = mongoDatabase.getCollection("activity_logs");
            System.out.println("Connected to MongoDB");


            // 3-2 document 만들어서 전송
            // 몽고db에 INSERT data
            Document activityLog = new Document();
            activityLog.append("user_id", userId);
            activityLog.append("activity", "Login");
            activityLog.append("timestamp","2024-11-20T10:00:00");

            Document activityLog2 = new Document();
            activityLog2.append("user_id", userId);
            activityLog2.append("activity", "Order");
            activityLog2.append("timestamp","2024-11-11T11:15:00");

            Document activityLog3 = new Document();
            activityLog3.append("user_id", userId);
            activityLog3.append("activity", "Order");
            activityLog3.append("timestamp",":2024-11-21T11:15:00");

            logCollection.insertOne(activityLog);
            logCollection.insertOne(activityLog2);
            logCollection.insertOne(activityLog3);

            //4. 회원정보는 mysql검색, 회원주문정보보기는 mongodb 검색하여 분산!
            //4-1 회원정보 mysql검색
            String selectUserSQL = "Select * from users where id=?";
            PreparedStatement selectpstmt = mysqlConnection.prepareStatement(selectUserSQL);
            selectpstmt.setInt(1, userId);
            ResultSet userResult = selectpstmt.executeQuery();
            if(userResult.next()) {
                System.out.println(userResult.getInt("id"));
                System.out.println(userResult.getString("name"));
                System.out.println(userResult.getString("email"));
                System.out.println(userResult.getString("signup_date"));
            }

            Document filter = new Document();
            ArrayList<Document> result = logCollection.find(filter).into(new ArrayList<>());
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
