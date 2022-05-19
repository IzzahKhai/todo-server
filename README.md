# TODO List Application - Backend
## About
This application was develop to implement a TODO-list server, where your users can
1. Sign in using any one of: gmail, facebook or github login.
2. Add a TODO item.
3. Delete a TODO item.
4. List all TODO items.
5. Mark a TODO item as completed.

## Build With
* Java Spring Framework
* PostgreSql

## Getting Started
### Prequisites

  * Java 11
  * Intellij IDEA
  * Git

### Installation
  1. Clone the repo
    ```
     git clone https://github.com/IzzahKhai/todo-server.git
    ```
  2. Open project in Intellij IDEA
      * Go to resources folder, and open the **application.yml** file to change the password and username of your database
      ```   
      datasource:
        password: your-postgres-password
        url: jdbc:postgresql://localhost:5432/todoserver
        username: your-postgres-username
  3. Run the **ToDOServerApplication.java** to start the server.
  
  ### Testing
  1. Run
    ``` 
  http:localhost:8080/api/v1/task 
    ``` on Postman or any API /REST development tools to add a **new task.**
  2. ![This is an example of adding new task.](/src-img/add.png)
  3. Run
    ```
     http:localhost:8080/api/v1/tasks
    ``` 
 **to list all** task in the list.
  4. Run 
    ```
  http:localhost:8080/api/v1/{userId}/{taskId}
    ```
        **to delete** all task in the list.
  5. Run ```http:localhost:8080/api/v1/{userId}/{taskId} ``` **to check** the list that have been complete.
  
#### Note
* The sign in using google is disable for now as something went wrong.
