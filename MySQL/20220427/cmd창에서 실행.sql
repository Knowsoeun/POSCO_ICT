mysql -u root -p

use web3;
show tables;

create user 'uesr1'%identified by '1234';  // %: 어디서든 접속 가능
create user 'uesr1'@ identified by '1234'; // @: local에서 접속 가능

