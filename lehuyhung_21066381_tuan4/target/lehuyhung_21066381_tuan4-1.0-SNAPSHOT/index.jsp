<!DOCTYPE html>
<html>
<head>
    <title>User Registration Form</title>
</head>
<body>
<h2>User Registration Form</h2>
<form action="register" method="post">
    First Name: <input type="text" name="firstName" required><br>
    Last Name: <input type="text" name="lastName" required><br>
    Email: <input type="email" name="email" required><br>
    Re-enter Email: <input type="email" name="reEmail" required><br>
    Password: <input type="password" name="password" required><br>
    Birthday: <input type="date" name="birthday"><br>
    Gender:
    <input type="radio" name="gender" value="Male"> Male
    <input type="radio" name="gender" value="Female"> Female
    <br>
    <input type="submit" value="Sign Up">
</form>
</body>
</html>
