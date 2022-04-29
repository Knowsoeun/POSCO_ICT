var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/mydb";

MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  console.log("Database created!");
  db.close();
});

// 참고로 js 파일은 경로에 맞게 저장해주어야 한다.
// 나는 C:\Users\BIT에 저장했다.
