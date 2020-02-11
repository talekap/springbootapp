# springbootapp

This is the code repository for the Springboot + camel EIP pattern Content Based Router

### Prerequisites

Apache Maven - version 3.6.0

Java 1.8

IntelliJ IDEA

Postman

Docker Toolbox

### Installing
Download Apache Maven here
https://maven.apache.org/

Download java here:
https://www.java.com/en/download/

Download IntelliJ community edition here:
https://www.jetbrains.com/idea/

Download Docker Toolbox <br />
For Mac:
https://docs.docker.com/toolbox/toolbox_install_mac/ <br />

For Windows:
https://docs.docker.com/toolbox/toolbox_install_windows/

Download PostMan here:
https://www.getpostman.com/downloads/

## Getting Started

To get a copy of the code run the following command on terminal/gitbash in the directory you want your code base in:

git clone https://github.com/talekap/springbootapp.git

Go to the Deployment section to see how to deploy the code.

## Deployment

To deploy the PoC application, complete the following:

1)  Run 'mvn clean install' in the parent project (springbootapp)

2)  mvn spring-boot:run


## Endpoints

Customer service </br>
http://localhost:8183/poc/customer/placeorder

## Testing

1) To test the PoC Customer service, open up Postman, copy the Customer service endpoint above into the URL field and Select POST.
Set the body of the request to the following. Change country to UK, USA or any country, then send the request.

    ```
    Request
    { 
      "name":"pradnya", 
      "country":"USA" 
    }


    Response
    { 
        "status": "ACK", 
        "country": "USA" 
    }
    ```



## Built With

* Springboot
* Apache Camel


