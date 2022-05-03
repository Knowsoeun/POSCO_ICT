## 1. MongoDB Shell 에서 "mydb" 데이터베이스 생성  

#### [cmd창에서 실행]  
```cmd
>mongo  
>show dbs
>use local
```

#### [demo_create_mongo_db.js 로 저장]  
```js
var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/mydb";
MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  console.log("Database created!");
  db.close();
});
```
![image](https://user-images.githubusercontent.com/63652571/166417590-5dd4cf21-99ae-47cc-b647-b28b001d1236.png)   
  
## 2. MongoDB Shell 에서 "member" 컬렉션 생성  
 
#### [demo_mongodb_createcollection.js 로 저장]  
 ```js
 var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";
 
MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  var dbo = db.db("mydb");
  dbo.createCollection("member", function(err, res) {
    if (err) throw err;
    console.log("Collection created!");
    db.close();
  });
});
``` 
![image](https://user-images.githubusercontent.com/63652571/166417668-dfe5fcc4-02d8-4838-b2d3-437224becda5.png)  


## 3. 자바에서 member 컬렉션에 다음과 같이 다큐멘트를 삽입  
### {"userid":"apple", "pwd":"1234", "name":"James", "telno":"010-2345-5432" , "height":"180cm", "weight":"78kg"}  
### {"userid":"banana", "pwd":"1234", "name":"Smith", "telno":"010-4545-1234", "height":"173cm", "weight":"65kg"}  
### {"userid":"kiwi", "pwd":"1234", "name":"anlang", "telno":"010-4478-1347", "height":"165cm", "weight":"70kg"}  
```cmd
db.member.insertOne({'userid':'apple','pwd':'1234','name':'James','telno':'010-2345-5432','height':180,'weight':78}) 
db.member.insertOne({'userid':'banana','pwd':'1234','name':'Smiith','telno':'010-4545-1234','height':173,'weight':65}) 
db.member.insertOne({'userid':'kiwi','pwd':'1234','name':'anlang','telno':'010-4478-1347','height':165,'weight':70}) 
```
![image](https://user-images.githubusercontent.com/63652571/166417752-a13d0cfa-a69a-4638-b794-90b5acddc975.png)
  
## 4. height가 180cm 보다 작은 회원의 이름을 조회  
```cmd
db.member.find({"height": {$lt: 180}}).pretty()
```
![image](https://user-images.githubusercontent.com/63652571/166417841-887b4e09-2fd2-472e-b2cb-9076c176a033.png)  
  
## 5. height가 180cm 보다 작거나 weight가 60 보다 크거나 같은 회원의 이름을 조회  
```cmd
db.member.find( { $or:[{"height": { $lt: 180},"height": {$gte: 60} }] } )
```
![image](https://user-images.githubusercontent.com/63652571/166417893-7ba09649-79cf-41b7-9325-dd7658277739.png)  
  

## 6. name이 Smith인 회원의 height 의 값을 190로 수정  
```cmd
db.member.update({
  name : 'Smith'
},
{
 usertid : 'banana',
  pwd : '1234',
  name : 'Smith',
  telno : '010-4545-1234',
  height : '190',
  weight : '65'
}) 

```
![image](https://user-images.githubusercontent.com/63652571/166417932-5cbd3f76-445e-4892-afc6-ffe033689abf.png)  
  
## 7. userid가 kiwi 인 회원을 삭제
```cmd
db.member.deleteOne({userid:'kiwi'});
```
![image](https://user-images.githubusercontent.com/63652571/166417979-f1bcbbb5-2e72-44e5-bebc-19c4e098c528.png)  

## 8. 다음과 같이 결과 출력(java)  
  
----------------
회원아이디: apple  
비밀번호: 1234  
이름: james  
전화번호: 010-2345-3432  
키 : 180cm  
몸무게: 78kg  
----------------
회원아이디: banana  
비밀번호: 1234  
이름: smith  
전화번호: 010-4536-3456  
키 : 173cm  
몸무게: 65kg  
----------------
  
```java
import java.util.Iterator;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
      public class Hi { 
         public static void main(String[] args) {
            try {
               // mongodb에 접속

               MongoClient mongoClient = new MongoClient("localhost", 27017);
               // database 연결
               MongoDatabase mongoDatabase = mongoClient.getDatabase("mydb");
               // MongoCollection 연결
               MongoCollection collection = mongoDatabase.getCollection("member");
                FindIterable iterDoc = collection.find();
               int i = 1;
               Document doc;
               Iterator it = iterDoc.iterator();
               while (it.hasNext()) { // hasNext() : 그 다음 레코드가 있으면 true, 없으면 false
                  doc = (Document)it.next();
                 System.out.println("ID: " + doc.get("userid"));
                 System.out.println("PW: " + doc.get("password"));
                 System.out.println("Name: " + doc.get("name"));
                 System.out.println("No: " + doc.get("telno"));
                 System.out.println("Height: " + doc.get("height"));
                 System.out.println("Weight:" + doc.get("weight")); 
                 System.out.println("———————————");
                 i++;                                    
               }
            } catch (Exception e) 
               System.out.println(e.getClass().getName());
            }
         }
      }

```
![image](https://user-images.githubusercontent.com/63652571/166418046-ee597e83-edc6-435f-b041-d6d3783fe56e.png)
