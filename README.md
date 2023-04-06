# backendproj1
This is a Java project for creating a RESTful API using Spring Boot that is connected to a PostgreSQL server.

The project can POST a data and GET all the list of data stored after.

The sample used in this project uses coffees.

To add a data:
1. Via Postman, use POST method with URL: http://localhost:8080/coffee
2. Write this in raw Body:
        {
        "coffeeName": "Sample Coffee",
        "location": "Place",
        "price": 750
        }

After that, it will return the list of coffees stored in the list.
