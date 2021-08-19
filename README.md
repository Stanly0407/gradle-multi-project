
### **Description**

An example of a gradle multi-project application.

Includes two modules:

**core** (with the logic of checking whether all the numbers entered by the user are positive)

**api** (to run the application)

The **_gradle shadow: 7.0.0 plugin_** is used to create a jar file of this project that can be run from the command line.
Command to run:
_java -cp multiproj-1.0-all.jar com.epam.demo.App ..._