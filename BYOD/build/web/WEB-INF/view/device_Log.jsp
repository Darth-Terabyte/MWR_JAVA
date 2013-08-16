<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<div class = "indent2">
        <h1>Scan results</h1>
<!--            
        <h3>Device ID:   12312123 </h3> <br/>-->
        <div class="content_interior">
            <!-- For each scan -->
<!--            <strong> ScanID: </strong>
            <strong> Date: </strong> 12/23/2013 <strong>Time:</strong> 13:45 <br/>
            <strong>OS Version:</strong> Android 4.2.3
            <strong>Rooted:</strong> True <br/><br/><br/><br/>
            <strong>Malware Scan: </strong>-->
            <table class = "table">
                    <tr class ="head">
                        <td> Scan Date </td>
                            <td > Rooted </td>
                            <td > USB Debugging Enabled </td>
                            <td > Apps from unknown sources allowed </td>
                            <td > Installed applications </td>
                    </tr>
                    <c:forEach var="scan" items="${scans}">
                    <tr><td>${scan.date}</td>
                        <td>${scan.rooted}</td>
                    <td>${scan.debuggingEnabled}</td>
                    <td>${scan.unknownSourcesAllowed}</td>
                     <td>${scan.apps}</td>

                    </tr>
                </c:forEach>
                    <!-- For every device display-->

            </table>

        </div>
</div>