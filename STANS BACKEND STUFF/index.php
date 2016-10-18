<!DOCTYPE html>
<html>
<body>

<h1> PHP Generated Page </h1>

<?php
$servername = "locationdb.cg6ciuaq7qev.us-west-2.rds.amazonaws.com";
$username = "admin";
$password = "asegroup4";
$dbname = "locationdb";
$connection = null;
function SQLinsert($LocationLat,$LocationLong, $UserID, $Time){
	echo "LocationLat: $LocationLat";
	echo "LocationLong: $LocationLong";
	echo "User ID:  $UserID";
	echo "Time: $Time";
$connection = new mysqli($GLOBALS['servername'], $GLOBALS['username'], $GLOBALS['password'], $GLOBALS['dbname']);
	if($connection->connect_error){
		echo "Connection Error";
	}
	#$query = "INSERT INTO test VALUES ('" . $name . "'," . $id . ")";
	
	$query1 = "INSERT IGNORE Users SET UserID = '" .$UserID."'";
	echo "<br> $query1";
	if($connection->query($query1) === TRUE){
		echo "USER ADDED";
	}
	$query2 = "INSERT INTO Locations VALUES(" . $LocationLat . "," . $LocationLong . ",'" . $UserID . "','" . $Time . "')";
	
	if($connection->query($query2) == TRUE){
		echo "LOCAITON LOGGED";
	}
	
	$connection->close();
}
if($_SERVER["REQUEST_METHOD"] == "POST"){
	#$Location = $_REQUEST['name'];
	SQLinsert($_REQUEST['locationLat'],$_REQUEST['locationLong'], $_REQUEST['id'], $_REQUEST['time']);
}else{
	#echo "no post request made";
}
function buildPage(){
	#$connection = new mysqli($GLOBALS['servername'], $GLOBALS['username'], $GLOBALS['password'], $GLOBALS['dbname']);
	
	$connection = mysql_connect($GLOBALS['servername'], $GLOBALS['username'], $GLOBALS['password']);
	if(!$connection){
		echo "Connection Error";
	}
	$query = "SELECT * FROM Locations";
	mysql_select_db('locationdb');
	$retval = mysql_query($query, $connection);
	
	if(!$retval){
		echo "could not get data";
	}
	echo "TABLE<br>";
	echo "--------------------------------------<br>";
	while($row = mysql_fetch_array($retval, MYSQL_ASSOC)){
		
		
		$maplink = "https://www.google.co.uk/maps/place/50%C2%B050'21.4%22N+0%C2%B007'00.6%22W/@" . "{$row['LocationLat']}" . "," . "{$row['LocationLong']}". "17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x0!8m2!3d50.8392746!4d-0.1168388";
		
		echo 	"| USER ID : {$row['UserID']}<br>".
				"|  LOCATION_LAT  :     {$row['LocationLat']} <br>".
				"|  LOCATION_LONG :	{$row['LocationLong']}<br>".
				"|  TIME :         {$row['Time']} <br>" .
				"|  <a href =" . $maplink . ">SEE ON MAP</a><br>" .
				"--------------------------------------<br>";
	}
	echo "Fetched data successfully\n";
	
	mysql_close($connection);
}
buildPage();
?>
</body>
</html>
