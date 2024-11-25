package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Memo여러개검색 {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost", 27017);

        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> memo = db.getCollection("memo");

        //List<Document> result
    }
}
