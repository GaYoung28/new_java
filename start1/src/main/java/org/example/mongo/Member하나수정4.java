package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Member하나수정4 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member 컬렉션까지 연결 성공~");

        //3. 전송할 js생성
        // update할 json(document)을 생성
        Document filter = new Document();
        filter.append("id","hong");

        Bson pw = Updates.set("tel","999");

        //4. 전송, 결과처리
        member.updateOne(filter, pw);
        client.close();

    }
}
