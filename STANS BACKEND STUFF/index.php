<!DOCTYPE html>
<html>
<body>

<h1> PHP Generated Page </h1>

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

function buildPage(){
	#$connection = new mysqli($GLOBALS['servername'], $GLOBALS['username'], $GLOBALS['password'], $GLOBALS['dbname']);
	
	$connection = mysql_connect($GLOBALS['servername'], $GLOBALS['username'], $GLOBALS['password']);
	if(!$connection){
		echo "Connection Error";
	}
	$query = "SELECT * FROM test";
	mysql_select_db('sl410');
	$retval = mysql_query($query, $connection);
	
	if(!$retval){
		echo "could not get data";
	}
	echo "TABLE<br>";
	echo "--------------------------------------<br>";
	while($row = mysql_fetch_array($retval, MYSQL_ASSOC)){
		echo 	"| NAME : {$row['name']}<br>".
				"|  ID :     {$row['id']} <br>".
				"--------------------------------------<br>";
	}
	echo "Fetched data successfully\n";
	
	mysql_close($connection);
}

if($_SERVER["REQUEST_METHOD"] == "POST"){
	$name = $_REQUEST['name'];
	SQLinsert($_REQUEST['name'], $_REQUEST['id']);
}else{
	#echo "no post request made";
}

buildPage();

?>
</body>
</html>