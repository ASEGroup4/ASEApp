<!DOCTYPE html>
<html>
<body>

<h1> Page </h1>

<?php

$servername = "mysql.student.sussex.ac.uk";
$username = "sl410";
$password = "tempSQLpass";
$dbname = "sl410";

$connection = null;


function SQLinsert($name, $id){
	
$connection = new mysqli($GLOBALS['servername'], $GLOBALS['username'], $GLOBALS['password'], $GLOBALS['dbname']);
	if($connection->connect_error){
		echo "Connection Error";
	}
	$query = "INSERT INTO test VALUES ('" . $name . "'," . $id . ")";
	
	if($connection->query($query) === TRUE){
		echo "New record Created";
	}else{
		echo "ERROR: " . $query . "<br>" . $connection->error;
	}
	
	$connection->close();
}


if($_SERVER["REQUEST_METHOD"] == "POST"){
	$name = $_REQUEST['name'];
	SQLinsert($_REQUEST['name'], $_REQUEST['id']);
}else{
	echo "no post request made";
}


?>
</body>
</html>