<form class="portal"> 
    <table>
        <tr>                            
            <td colspan ="3"><h1>Register Technician</h1></td>
        </tr>
        <tr>
            <td> </td>
        </tr>
        <tr>
            <td>Employee Code:</td>
            <td><input type="text" name="empC" ></td>
            <td><p id ="employeE"></p></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username"></td>
            <td><p id ="unameE"></p></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="pwd1" ></td>
            <td><p id ="passE"></p></td>
        </tr>
        <tr>
            <td>Confirm Password:</td>
            <td><input type="password" name="pwd2" ></td>
            <td><p id ="pass2E"></p></td>
        </tr>
        <tr>
            <td>Apply for admin profile:</td>
            <td><input type="checkbox" name="admin" ></td>
        </tr>
        <tr>
            <td colspan ="2">
                <input id ="button" type="button" onclick ="registerUserNav()" name="register" value ="Register"/>
            </td>
        </tr>
        <tr>
            <td> </td>
        </tr>
        <tr>
            <td colspan ="2"><a href="index.jsp" target ="_parent">back</a></td>
        </tr>
    </table>
</form>