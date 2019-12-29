create database sb1901;
USE sb1901;
create table `user` (
  `id` int (11) PRIMARY KEY AUTO_INCREMENT,
  `user_name` varchar (60),
  `password` varchar (60),
  `name` varchar (60),
  `birthday` date ,
  `gender` int (11),
  `created` datetime ,
  `updated` datetime
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
GRANT  ALL PRIVILEGES ON `sb1901`.* TO 'bigdata'@'%' IDENTIFIED BY 'sorry';
insert into `user` (`id`, `user_name`, `password`, `name`, `birthday`, `gender`, `created`, `updated`) values('1','zhangsan','123456','张三','2019-06-10','1','2019-06-10 10:03:52','2019-06-10 10:03:55');
insert into `user` (`id`, `user_name`, `password`, `name`, `birthday`, `gender`, `created`, `updated`) values('2','lisi','123456','李四','2019-06-03','0','2019-06-09 10:04:17','2019-06-12 10:04:21');
