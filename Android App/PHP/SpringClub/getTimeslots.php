<?php

if($_SERVER['REQUEST_METHOD']=='POST'){

include 'DatabaseConfig.php';

 $selectedDate= $_POST['selectedDate'];
 $selectedFacilityId= $_POST['selectedFacilityId'];

// Create connection
$conn = new mysqli($HostName, $HostUser, $HostPass, $DatabaseName);

if ($conn->connect_error) {
 
 die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT * FROM bookingdetails bd, maintenances m where bd.facilityid = m.facilityid and m.facilityid = $selectedFacilityId";

$result = $conn->query($sql);

if ($result->num_rows >0) {
 
 
 while($row[] = $result->fetch_assoc()) {
 
 $tem = $row;
 
 $json = json_encode($tem);
 
 }
 
} else {
 echo "No Results Found.";
}
 echo $json;

$conn->close();
}
?>