package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Member하나삭제 {
    public static void main(String[] args) {
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member 컬렉션까지 연결 성공~");

        //3. 전송할 js생성
        // delete할 json(document)을 생성

        Document filter = new Document("id","apple");
        //db.member.deleteOne({})

        //4. 전송, 결과처리
        member.deleteOne(filter);
        System.out.println("몽고db에 전송함");
        client.close();

    }
}
