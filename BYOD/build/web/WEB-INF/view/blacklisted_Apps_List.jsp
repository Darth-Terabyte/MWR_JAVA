
<div class="details">
    <h1> Blacklisted Applications</h1>
    <div class="content_interior">
        <table class = "table">
                <tr class = "head">
                        <td > Application Name </td>
                        <td > Date Added </td>
                        <td > Remove from List </td>
                </tr>
                <tr></tr>
                <!-- For every device display-->
                <% int sizeMal = 6;
                    for (int i = 0; i < sizeMal; i++)
                        out.write("<tr>"+
                                        "<td > Facebook </td>" +
                                        "<td > 05/06/2014</td>"+
                                        "<td > <input type=\"button\" name = \"remove_app_black\" onclick=\"removeAppNav('name')\"  value = \"Remove\"> </td>"+
                                "</tr>"); 
                %>
                <!--
                    <tr>
                        <c:forEach var="row" items="${result.rowsByIndex}">
                            <tr>
                                <c:forEach var="column" items="${row}">
                                    <td><c:out value="${column}"/></td>
                                </c:forEach>
                            </tr>
                        </c:forEach>
                    </tr>
                -->
        </table>
    </div>
        <form name="addApp" action="addAppNav()">
            <input type="button" name = "add_app_black" onclick="addAppNav()" value = "Add Application to Blacklist"> 
        </form>
</div>