<?php

    $firstName = $_POST['firstName'];
    $lastName = $_POST['lastName'];
    $email = $_POST['email'];
    $username = $_POST['username'];
    $password = $_POST['password'];
    $phone = $_POST['phone'];

    // Connection
    
    $conn = new mysqli('localhost','root','','elm_database');
    if ($conn->connect_error) {
        die('Failed ):'. $conn->connect_error);
    } else {
        $stmt = $conn->prepare("insert into reg_as_tutor(firstName, lastName, email, username, password, phone)
        values(?,?,?,?,?,?)");
        $stmt->bind_param("ssssss", $firstName, $lastName, $email, $username, $password, $phone);
        $stmt->execute();
        echo"Good connect";
        $stmt->close();
        $conn->close();
    }


?>