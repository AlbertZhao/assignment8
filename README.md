# assignment8

git init

git add README.md

git commit -m "first commit"

git remote add origin git@github.com:AlbertZhao/assignment8.git

git push -u origin master



# Maven

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

#a.What will be the command to compile the project? 
mvn compile
#b.What will be the command to  package the built project?
mvn package

#c.What will be command to execute the jarwhich is created by above command?
mvn jetty:run
mvn tomcat7:run

#d.What will be command to clean all the compiled class files and jar files in target folder?
mvn clean install



#Junit Assignment
