# CarRental Rest Web Service with Spring

Download and unzip the project (outside the Eclipse workspace)

Open a command line window (project location).

Use the following command to build the project (download libraries, compilation…):
-	gradlew build			    	under windows
-	./gradlew build			    	under Linux

Use the following command to convert the project in an Eclipse project:
-	gradlew eclipse					under windows
-	./gradlew eclipse				under Linux

Import the project under Eclipse: File->Import->General-> Existing project into workspace ... select the project directory

Launch the main program: https://github.com/charroux/CarService/blob/master/src/main/java/com/example/CarRental/CarRentalApplication.java

Open a web browser to test the http get request: http://localhost:8080/cars

# Test with curl

curl -X GET -i http://localhost:8080/cars

curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/cars --data '{"plateNumber":"55DD77", "brand": "Mazerati", "price":2000, "rent":false}'

curl -X PUT -H 'Content-Type: application/json' -i 'http://localhost:8080/cars/11AA22?rent=true' --data '{"begin":"5/5/2025", "end": "7/5/2025"}'

curl -X PUT -H 'Content-Type: application/json' -i 'http://localhost:8080/cars/11AA22?rent=false'

# Java Rest client

Launch the main program: https://github.com/charroux/CarService/blob/master/src/main/java/com/example/CarRental/CarRentalClient.java

# Javascript client

Open a web browser to test the Javascript program: http://localhost:8080/static/index.html

The web part configuration: https://github.com/charroux/CarService/tree/master/src/main/webapp/WEB-INF

The html part: https://github.com/charroux/CarService/tree/master/src/main/webapp/static

