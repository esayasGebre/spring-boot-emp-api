# Emp API's

Tech. used: Spring boot, Spring REST, JPA/Hibernate, Spring Data, JSON, H2 database
IDE: Spring Tool Suite
Testing tool: Postman

Layers ( Config, Domain, Controller, Service, Service Validation, Repository )

Sample test/interface postman 

Inserting new Employee::
POST  {{url}}/emp/api/employees/
  
  Body:
    {
    	"id":109,
        "name":"joni",
        "salary":120000,
        "phone":"3127894321"
    }
    
    Getting list of all Employees:
    
    GET  {{url}}/emp/api/employees/
    
    Result Body:
    
    [
        {
            "id": 101,
            "name": "esa",
            "salary": 34000,
            "phone": "1213223333"
        },
        {
            "id": 102,
            "name": "aida",
            "salary": 75000,
            "phone": "7777777090"
        },
        {
            "id": 105,
            "name": "lora",
            "salary": 33000,
            "phone": "8888888888"
        },
        {
            "id": 107,
            "name": "fana",
            "salary": 3000,
            "phone": "9090909090"
        },
        {
            "id": 109,
            "name": "joni",
            "salary": 120000,
            "phone": "3127894321"
        }
    ]


Get Employee byID: example  id:105

GET {{url}}/emp/api/employees/105

Result Body:

    {
      "id": 105,
      "name": "lora",
      "salary": 33000,
      "phone": "8888888888"
    }
    
    
    Finding not exist employee will generate an error message:: 
    
    For example trying to get/find employee ID:100 will generate the bellow message::
    
        {
            "timestamp": 1508867145452,
            "status": 500,
            "error": "Internal Server Error",
            "exception": "java.lang.NullPointerException",
            "message": "No message available",
            "path": "emp/api/employee/100"
        }
    
    
    
