# CarRental Rest Web Service with Spring boot

Download and unzip the project (outside the Eclipse workspace)

## Importation

Under Eclipse : File -> Import -> Gradle ...

Under Intellij : open

## Launching

Launch the main program: https://github.com/charroux/CarService/blob/master/src/main/java/com/example/CarRental/CarRentalApplication.java

Open a web browser to test the http get request: http://localhost:8080/cars

## The Web Service

https://github.com/charroux/CarService/blob/master/src/main/java/com/example/CarRental/CarRentalService.java

# Test with curl

Get a the list of cars :

curl -X GET -i http://localhost:8080/cars

Add a new car :

curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/cars --data '{"plateNumber":"55DD77", "brand": "Mazerati", "price":2000, "rent":false}'

Rent a car : 

curl -X PUT -H 'Content-Type: application/json' -i 'http://localhost:8080/cars/11AA22?rent=true' --data '{"begin":"5/5/2025", "end": "7/5/2025"}'

Get back z car :

curl -X PUT -H 'Content-Type: application/json' -i 'http://localhost:8080/cars/11AA22?rent=false'

# Java Rest client

Launch the main program: https://github.com/charroux/CarService/blob/master/src/main/java/com/example/CarRental/CarRentalClient.java

# Javascript client

Open a web browser to test the Javascript program: http://localhost:8080/static/index.html

The web part configuration: https://github.com/charroux/CarService/tree/master/src/main/webapp/WEB-INF

The html part: https://github.com/charroux/CarService/tree/master/src/main/webapp/static

