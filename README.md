# Online Code Checker and Compiler in Java : CodeOj ( codeoj.com )

Online Code Checker and Compiler system ( formally CodeOj / Code Online Judge ) is java based  automated testing system to check the Algorithmic skills of the user providing a platform to compete with large no of software developers.

It develop "Fast & Furious" attitude to the coders to be Accurate and Efficient in coding. It will enhance the speed of hiring procedure. Recruiters can assign hiring coding task and schedule the event as per their suitability. Moreover the project can be used for educational purpose for students around the world learning competitive programming.

###  Quality Attributes of the Software : 
  - Scalable and high performance : Concurrent requests optimization.
  - Java8 with Database Independence Software System.
  - Study of component based reliability modeling on code checker System with the study of code checker's component use factor / component use ratio.
  - Extensible, Simple and Easy to use [web / desktop] Interface : Easily configurable at local or web.
  - Fully Automated Event/Creation, Judging & result preparation, result statics.
  - Assigning and dynamic update of user ratings as per their overall performance. 
 
> CodeOj follows the concept of "Data independence" which is the type of data transparency that matters for a centralized DBMS. It refers to the immunity of user applications to changes made in the definition and organization of data. Physical data independence deals with hiding the details of the storage structure from user applications.

CodeOj allows you to use whichever database you want to use or at any stage of development process you can change the DB.

### Version
1.0.0

### Tech Stack

CodeOj uses a number of open source tools and technology to work properly:

* [Java8] - Open JDK.
* [Ace Editor] - Awesome web-based text editor
* [Hibernate ORM] - A Java based ORM providing several features of data persistence like object caching, mapping etc.
* [Twitter Bootstrap] - UI boilerplate for modern responsive web apps
* [JUnit] - Unit tests in Java
* [chroot "jail"] - Sand-boxing / virtualization of computing node 
* [Database] - Initially MySQL but you are free to use any open source DB.
* [Python] - for running core checker script.
* [jQuery] - UI JS

And of course CodeOj itself is open source with a [public repository][dill]
 on GitHub.

### Installation

CodeOj requires [java v7+](http://www.oracle.com/technetwork/java/javase/downloads/jre7-downloads-1880261.html) to run.

You need Gulp installed Open source IDE Netbeans v7.x+ with Tomcat server.[Download here](https://netbeans.org/downloads/) and follow installation [instruction](https://netbeans.org/community/releases/81/install.html).

##### A. Install MySQL Server : ( You can go with any other relational databases like DB2 etc. )

For Linux users: 
```sh
$ sudo apt-get install mysql-server                     
$ sudo service mysql start                  # start  mysql server 
$ mysql -u root -p                          # login with username and password
$ create database codeoj                    # create a database
In the mysql shell :
mysql> CREATE USER 'admin'@'localhost' IDENTIFIED BY 'some_pass';
mysql> GRANT ALL PRIVILEGES ON codeoj.* TO 'admin'@'localhost'
    ->     WITH GRANT OPTION;
```

##### B. Install Linux, Apache, MySQL, PHP (LAMP) Stack : please follow the [link for detailed instruction](https://www.digitalocean.com/community/tutorials/how-to-install-linux-apache-mysql-php-lamp-stack-on-ubuntu).
##### C. Set up repository :
Install git and perform following commands for set up the CodeOj repo:
```sh
$ git clone  https://github.com/Online-Code-Checker-Java
$ cd codeoj
$ chmod -R 777 codeoj
$ sudo apt-get install python-psutil
$ sudo apt-get install python-mysqldb
```
Then specify the  path of "web" folder to the path variable in src/java/connection/Path.java file.
```sh	
     static String path = "path/to/codeoj/web";
```
and set the database configurations in in src/java/connection/Config.java file

```sh	
    String url = "jdbc:mysql://localhost:3306/codeoj"; //Set up Database server location URL , Port No , Database Name
    String user = "USERNAME";      // Set MySQL(or your DB User)
    String pass = "PASSWORD";      // DB password
```
also set the database configurations in web/judge.py file 
```sh	
    db = MySQLdb.connect("localhost","USERNAME","PASSWORD","codeoj")
```

#### D. Supported Languages:

CodeOj is currently extended with the following languages, so you have to install their respective compilers in your run environment. 
* C
* C++              
* Java
* Ruby
* Python
* PHP
* Perl
* Scala
* Java Script
* Bash
* Haskell

##### E. Configuring CHRoot (Sand-boxing in Linux environment ) :

Sand-boxing provides security by creating a restricted environment for the execution of user's source code for various languages.
* It disable the system calls : user's source code can initiate system calls which can take control and damage the system
* Limit Memory and CPU allocation : Each Process is Independent and run within their allocated % unit of memory and CPU . It motivate "Optimal Resource Allocation" in restricted Environment. One process cannot communicate or interfere the other running process .
* Prevent the use of system libraries and disable TCP/IP networking.

Please follow the following resource for [documentation](https://en.wikipedia.org/wiki/Chroot) and [installation](https://wiki.debian.org/chroot) of CHRoot


### CodeOj in Action : Administrative Functions

* Step A: Create a admin in the "codeoj" database "Admin" table by adding a row with a username and MD5 encrypted password entry.

* Step B: Import Project in  NetBeans and perform "Build and Run".

* Step C: If you are Re-installing the CodeOj project and you already have backup files file1.sql,/file2.sql etc . Add following line in src/java/hibernate.cfg.xml hibernate configuration file. 
 
```sh
<property name="hibernate.hbm2ddl.import_files" value="/file1.sql,/file2.sql"/>
<property name="hibernate.hbm2ddl.auto" value="create"/>
```
* If you are installing it first time you need not to create the all the tables or does not require to restore schema structure Dump , If a particular table doesn't exists , Hibernate Framework creates these tables automatically. Thanks to Hibernate ORM magic.

* Step D : Open Admin Panel by hitting http://localhost:8080/codeoj/ap/adminpanel.jsp  in browser (make sure tomcat running at port 8080) and login with admin username and password.

* Step E : After login successfully login a form will be shown for asking "Contest Code"  followed by " Contest Name " ," Start Time Stamp " ," End Time Stamp " , " No of Problems " , " Contest Poster " and " Contest Instructions ".

* Step F : Click add problems to add Algorithmic Problems to the Specific Contest by filling " Problem Code" , " setter name " , " tester name " , " execution time limit" , " problem description " " no of test I/O files " . 

That's all for creating a new live contest . To participate in a contest , user's should register for contest in contest page or contest register link at home page .

 Admin can make solution public after the contest by clicking make public button. CodeOj uses [ACM style rank list](https://icpc.baylor.edu/) with  [Elo rating system](https://en.wikipedia.org/wiki/Elo_rating_system) . 



### Development

Want to contribute? Great!

We wish to complete following to-dos ASAP by moving **[Spring Framework 4.2.6](https://projects.spring.io/spring-framework/)**


### To-dos

 - Increase Scalability for handling more concurrent Requests/Second
 - Write Unit Tests
 - Improve code quality
 - Add Efficient plagiarism detector
 - Introducing Parallelism in System for Increase Reliability.
 - Add support for more programming languages
 
For further queries write me to developer.jaswant@gmail.com .

License
----

MIT


**Free Software under MIT**




[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)
   [Python]: https://www.python.org/
   [Database]: https://www.mysql.com/
   [chroot "jail"]: http://allanfeid.com/content/creating-chroot-jail-ssh-access
   [JUnit]: http://junit.org/junit4/
   [Hibernate ORM]: http://hibernate.org/orm/
   [java8]: http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html
   [dill]: <https://github.com/joney000/Online-Code-Checker-and-Compiler-in-Java-CodeOj-codeoj.com->

   [john gruber]: <http://daringfireball.net>

   [df1]: <http://daringfireball.net/projects/markdown/>
  
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [keymaster.js]: <https://github.com/madrobby/keymaster>
   [jQuery]: <http://jquery.com>
   
   

  
