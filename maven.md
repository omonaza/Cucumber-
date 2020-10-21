#Maven is a project/dependency management and project building tool.

##Why? What problem? 
number 1 problem maven solves: 
Before maven java developers had to manually download all required libraries and import to the project. 
okay you that only once right? if you are the only developer then yes. 
But if you are sharing your with other devs it means when you share your code they need to redo the same process 
which is download and import to the project.

Maven solves that with depedency management which is an automatic process of dowloading the specified libraries into your 
local machine. And importing them to your project. in order to change version of a library all it takes is just 
to change version number in pom.xml


number 2 problem maven solves:
as a developer you need to create jar files of a java project which is the final artifact that is executed by clients.
So it has many manual steps if done without maven. steps are to compile, if your project uses some files then you have to 
keep transfering those files with the project.

in maven it includes all resources in jar file. 

Also maven helps you push your project new version to remote repository automatically.



We can compile and create jar files using maven goals. 

maven goals(Lifecycle) are the following:

clean -> it cleans(deletes) target folder.
validate -> make sure all dependecies are loaded.
compile -> complies all of the classes and resources and puts them in target folder.
test    -> runs all tests. (surefire or fail-safe plugins). if no plugins are specified maven will run all tests
that are defined under src/test/java. 
package -> will create a jar file of this project in target folder
verify  -> will generate reports of tests run.
install -> pushes jar file from target folder to local maven repository. aka .m2 folder. 
deploy  -> pushes jar file from local maven repository to remote maven repository. 


what is local maven repository? 

what is remove maven repository?




jar file -> is a compressed file of this project. one executable file that is a program.
it's purpose is to hide all code from being visible to others and only allow them to run your program.


zip file -> it's purpose is to compress and make a file light on memory.

