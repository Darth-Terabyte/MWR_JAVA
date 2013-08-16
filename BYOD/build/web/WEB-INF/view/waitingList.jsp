<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
        <h3>Devices to be registered</h3> 
        <hr/>

        <table class = "table">
                <tr class =  "head">
                        <td >Manufacturer</td>
                        <td >Model</td>
                        <td >Serial number</td>
                        <td >MAC Address</td>
                        <td >Android ID</td>
                        <td >Name</td>
                        <td >Surname</td>
                        <td >ID Number</td>
                        <td >Token</td>
                        <td></td>
                </tr>  
                <c:forEach var="dev" items="${waitinglist}">
                    <tr>
                    <form action="registerDevice" method="post">  
                        <input type="hidden" name="id" value="${dev.IDNumber}">
                    <td>${dev.make}</td>
                    <td>${dev.model}</td>
                    <td>${dev.devicenotregisteredPK.serialNumber}</td>
                    <td>${dev.devicenotregisteredPK.MACAdress}</td>
                    <td>${dev.devicenotregisteredPK.androidID}</td>
                    <td>${dev.name}</td>
                    <td>${dev.surname}</td>
                    <td>${dev.IDNumber}</td>
                    <td>${dev.token}</td>
                    <td><input type="submit"
                               name="submit"
                               value="Register">
                    </form>
                    </tr>
                </c:forEach>

        </table>
</div>
