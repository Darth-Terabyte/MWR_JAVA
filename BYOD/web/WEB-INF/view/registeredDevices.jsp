<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<div class="details">
    <form id ="searchTechForm" action="" class="sale">
            <strong><h1>Registered Technicians</h1></strong>
            <div class="content_interior"> 
                    <table class = "search">                        
                        <tr>
                            <td >Employee ID:
                                <input type="text" name="empID" id="empID" size="30" class="input" maxlength="13"></td >
                            <td >Date Registered:
                                <input type="text" name="dateReg" id="dateTechRegSearch" size="30" class="input"></td >
                            <td >Full Name:
                                <input type="text" name="empFullName" id="empFullName" size="30" class="input"></td >

                            <td ><input type="submit" name="searchTech" class="search" value="Search" id="searchTech" /></td >
                        </tr>
                    </table>
            </div>
        </form>
</div>

<div class = "indent2">
<br/>
        <h3>11085802 (Werner Raath)</h3> 
        <hr/>

        <table class = "table">
                <tr class =  "head">
                        <td > Employee Code </td>
                        <td > Full Name </td>
                        <td > Date Registered </td>
                        <td > Devices Fixed </td>
                        <td > Devices Registered </td>
                </tr>  
                <c:forEach var="tech" items="${technicians}">
                    <tr><td>${tech.employeeCode}</td>
                    <td>${tech.userName}</td>
                    <td>${tech.dateRegistered}</td>
                    <td>None</td>
                    <td>None</td>
                    </tr>
                </c:forEach>

        </table>
</div>