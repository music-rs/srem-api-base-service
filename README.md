**SREM API BASE SERVICE**

**Installation process**:
- Firstly, you need an Oracle DB, use the SQL code in the /sql folder to run the initial database.

- Then, add the ojdbc11.jar to the project, using the following command:

      mvn install:install-file -Dfile=./lib/ojdbc11.jar -DgroupId=com.oracle -DartifactId=ojdbc11 -Dversion=21.7 -Dpackaging=jar
- Run the following command:

      mvn clean install
- Execute the application and try the following API: http://localhost:8087/srem/swagger-ui/index.html
- Create Oracle Database Container: Use the following command:

      docker run -d --name oracle21ee -v D:/oradata:/opt/oracle/oradata -p 1521:1521 -p 5500:5500 -e ORACLE_PWD=oracle jhonatanit/oracle:21.3.0-ee
- Execute sql queries (query folder)
