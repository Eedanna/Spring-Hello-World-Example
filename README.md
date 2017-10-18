Here are the Steps to execute this project
----------------------------------------------

1. Clone / download the codebase in to your local machine
2. Open Eclipse IDE (as i have used eclipse for this project), import as a maven project
3. Execute mvn clean install
4. Add Tomcat server to the eclipse
5. Right on the project and select properties option and perform all the below steps
   -- Goto build path tab and verigy all the jars are available
   -- Goto Order and Export tab and select all the jars and the click Apply button
   -- Goto Deployment Assemble tab and then add all the M2_repo jars using Add button
   -- Goto Server tab, select tomcat and click apply
   -- Goto Targeted Runtimes tab, select tomcat and click apply
   -- Goto Web Project setting tab , edit context root value as your wish (I have given SpringMVC)
   
 6. Add project to the Tomcat server
 7. Start tomcat server
 8. Launch the applciation using the below URLs
 
   -- http://localhost:8080/SpringMVC/welcome
   -- http://localhost:8080/SpringMVC/hi?name=User1
   
   
