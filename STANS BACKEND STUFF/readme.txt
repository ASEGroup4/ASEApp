index.php is a copy of the script thats running on my uni web space
	(user.sussex.ac.uk/~sl410/php/index.php)

This script takes a name and an id and enters them into the database.
The database is the one that the uni provides for the databases course, we can easily migrate 
later. Also the script has my credentials for the database, ive made a temp password for the mysql 
server so we can all access it.

main.java is a class that sends a http request to the server including values name and id (we will 
change these to device id and location in the future).
it also prints out what it gets back but this is just for debugging.

this all works at the moment, we just need to integrate it into the app.