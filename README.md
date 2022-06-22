# CountryApiApplication
A sample spring boot application to demonstrate pagination pattern

# To start the application
 Type ./mvnw spring-boot:run in the project directory.
 
 # To visit the api using postman
To list paginated countries : localhost:8182/api/v1/countries?prevPage=0&nextPage=1&pageSize=10


To search for a country by name: localhost:8182/api/v1/countries/Alge

To add a new country : localhost:8182/api/v1/countries   -> Post Json Body

{
    "name":"Nunu Island"
}

