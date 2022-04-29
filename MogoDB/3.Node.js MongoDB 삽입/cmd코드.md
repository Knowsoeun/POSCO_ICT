#### 1. "customers" 컬렉션에 문서 삽입
```cmd
demo_mongodb_insert.js
```
![image](https://user-images.githubusercontent.com/63652571/165910495-7200d315-84d7-411a-841f-4187ee9c69d4.png)

#### 2. "customers" 컬렉션에 문서 삽입:
```cmd
node demo_mongodb_insert_multiple.js
```
![image](https://user-images.githubusercontent.com/63652571/165910784-d67b6a23-9d0c-482c-8465-a7bff3e4695c.png)

#### 3. 결과 개체  
메서드를 실행하면 insertMany()결과 개체가 반환됩니다.  
결과 개체에는 삽입이 데이터베이스에 어떤 영향을 미쳤는지에 대한 정보가 포함되어 있다.  
```js
{
  result: { ok: 1, n: 14 },
  ops: [
    { name: 'John', address: 'Highway 71', _id: 58fdbf5c0ef8a50b4cdd9a84 },
    { name: 'Peter', address: 'Lowstreet 4', _id: 58fdbf5c0ef8a50b4cdd9a85 },
    { name: 'Amy', address: 'Apple st 652', _id: 58fdbf5c0ef8a50b4cdd9a86 },
    { name: 'Hannah', address: 'Mountain 21', _id: 58fdbf5c0ef8a50b4cdd9a87 },
    { name: 'Michael', address: 'Valley 345', _id: 58fdbf5c0ef8a50b4cdd9a88 },
    { name: 'Sandy', address: 'Ocean blvd 2', _id: 58fdbf5c0ef8a50b4cdd9a89 },
    { name: 'Betty', address: 'Green Grass 1', _id: 58fdbf5c0ef8a50b4cdd9a8a },
    { name: 'Richard', address: 'Sky st 331', _id: 58fdbf5c0ef8a50b4cdd9a8b },
    { name: 'Susan', address: 'One way 98', _id: 58fdbf5c0ef8a50b4cdd9a8c },
    { name: 'Vicky', address: 'Yellow Garden 2', _id: 58fdbf5c0ef8a50b4cdd9a8d },
    { name: 'Ben', address: 'Park Lane 38', _id: 58fdbf5c0ef8a50b4cdd9a8e },
    { name: 'William', address: 'Central st 954', _id: 58fdbf5c0ef8a50b4cdd9a8f },
    { name: 'Chuck', address: 'Main Road 989', _id: 58fdbf5c0ef8a50b4cdd9a90 },
    { name: 'Viola', address: 'Sideway 1633', _id: 58fdbf5c0ef8a50b4cdd9a91 } ],
  insertedCount: 14,
  insertedIds: [
    58fdbf5c0ef8a50b4cdd9a84,
    58fdbf5c0ef8a50b4cdd9a85,
    58fdbf5c0ef8a50b4cdd9a86,
    58fdbf5c0ef8a50b4cdd9a87,
    58fdbf5c0ef8a50b4cdd9a88,
    58fdbf5c0ef8a50b4cdd9a89,
    58fdbf5c0ef8a50b4cdd9a8a,
    58fdbf5c0ef8a50b4cdd9a8b,
    58fdbf5c0ef8a50b4cdd9a8c,
    58fdbf5c0ef8a50b4cdd9a8d,
    58fdbf5c0ef8a50b4cdd9a8e,
    58fdbf5c0ef8a50b4cdd9a8f
    58fdbf5c0ef8a50b4cdd9a90,
    58fdbf5c0ef8a50b4cdd9a91 ]
}
```
- 삽입된 문서의 수 반환
```cmd
>console.log(res.insertedCount)
```
![image](https://user-images.githubusercontent.com/63652571/165911063-15137178-0490-47f2-823d-f68f54a8de37.png)

#### 4.id 필드
필드를 지정하지 않으면 idMongoDB가 필드를 추가하고 각 문서에 고유한 ID를 할당한다.  
위의 예에서는 id필드가 지정되지 않았으며 결과 개체에서 볼 수 있듯이 MongoDB는 각 문서에 대해 고유한 id를 할당했다.  
필드를 지정하는 경우 값 id은 각 문서에 대해 고유해야 한다.  
- id지정된 필드 와 함께 "products" 테이블에 세 개의 레코드를 삽입한다.
```js
var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  var dbo = db.db("mydb");
  var myobj = [
    { _id: 154, name: 'Chocolate Heaven'},
    { _id: 155, name: 'Tasty Lemon'},
    { _id: 156, name: 'Vanilla Dream'}
  ];
  dbo.collection("products").insertMany(myobj, function(err, res) {
    if (err) throw err;
    console.log(res);
    db.close();
  });
});
```
```cmd
>C:\Users\Your Name>node demo_mongodb_insert_id.js
```  
![image](https://user-images.githubusercontent.com/63652571/165911282-8829e979-99a3-4209-b395-c47d04821573.png)
