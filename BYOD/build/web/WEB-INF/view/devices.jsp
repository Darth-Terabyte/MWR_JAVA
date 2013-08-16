<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
        <h3>Registered Devices</h3> 
        <hr/>

        <table class = "table">
                <tr class =  "head">
                        <td >Manufacturer</td>
                        <td >Model</td>
                        <td >Serial number</td>
                        <td >MAC Address</td>
                        <td >Android ID</td>
                </tr>  
                <c:forEach var="dev" items="${devices}">
                    <tr><td>${dev.make}</td>
                    <td>${dev.model}</td>
                    <td>${dev.devicePK.serialNumber}</td>
                    <td>${dev.devicePK.MACAddress}</td>
                     <td>${dev.devicePK.uid}</td>
                    </tr>
                </c:forEach>

        </table>
</div>