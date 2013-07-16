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
                        <td > Employee ID </td>
                        <td > Full Name </td>
                        <td > Date Registered </td>
                        <td > Devices Fixed </td>
                        <td > Devices Registered </td>
                </tr>
                <!-- For every device display-->
                <% int size = 25;
                    for (int i = 0; i < size; i++)
                        out.write("<tr>"+
                                        "<td ><a href=\"technicianDetails.jsp\"> 123234535 </a></td>"+
                                        "<td > HTC Wildfire</td>"+
                                        "<td > 05/06/2014</td>"+
                                        "<td > <input type= \"button\"  value = \"Fix Log\" onclick = \"userFixLogNav()\" > </td>"+
                                        "<td > <input type= \"button\"  value = \"Register Log\" onclick = \"userRegisterLogNav()\"> </td>"+
                                    "</tr>"); 
                %>
        </table>
</div>