package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Memo하나검색 {
    public static void main(String[] args) {
        //1.
        MongoClient client = new MongoClient("localhost", 27017);

        //2.
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> memo = db.getCollection("memo");

        //3.
        Document filter = new Document();
        filter.append("age",3);

        //4.
        List<Document> result = memo.find(filter).into(new ArrayList<Document>());
        System.out.println(result.get(0).getString("name"));
        System.out.println(result.get(0).getInteger("age"));
        System.out.println(result.get(0).getString("office"));
        System.out.println(result.get(0).getString("phone"));

        client.close();
    }
}
