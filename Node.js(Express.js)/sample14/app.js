const mysql = require('mysql');

// mysql 접속설정
const conn = {
    host: 'localhost',
    port: '3306',
    user: 'root',
    password: '1234',
    database: 'mydb'
};

var connection = mysql.createConnection(conn);

connection.connect();

// select
/* 
var sql = "SELECT * FROM TABLESAMPLE";

// QUERY 실행
connection.query(sql, function(err, results, fields){
    if(err) console.log(err);

    console.log("접속 성공!");
    console.log(JSON.stringify(results));
});
 */

// insert
/* 
var sql = "INSERT INTO TABLESAMPLE(ID, NAME) "
        + "VALUES('bcd', '성춘향')";

connection.query(sql, function(err){
    if(err) console.log(err);

    console.log("추가 성공!");
});
 */

var sql = "INSERT INTO TABLESAMPLE(ID, NAME) "
        + "VALUES(?, ?)";
var param = ['cde', '정수동'];

connection.query(sql, param, function(err){
    if(err) console.log(err);

    console.log("추가 성공!");
});




