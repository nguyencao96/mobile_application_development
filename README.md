# mobile_application_development
## Exercise 1 installation
### Part 1
Open `location.html`, enter latitude and longitude to get address
### Part 2
Install the dependencies and start the application
    $ npm start
The server will start at http://127.0.0.1:3000

To get Distance from 2 points, use this request
    > GET http://127.0.0.1:3000/api/distance
with query params:
    *lat1 : latitude of the 1st point
    *lon1 : longitude of the 1st point
    *lat2 : latitude of the 2nd point
    *lon2 : longitude of the 2nd point
example: 
    > GET http://127.0.0.1:8080/api/distance?lat1=10.830075&lon1=106.670268&lat2=10.828113&lon2=108.674906