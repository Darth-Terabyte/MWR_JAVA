
<div class="details">
        <form class="sale">
                <h1> Fix device</h1>
                <div class="content_interior">
                    Employee ID <br/>
                    <input type="text" name="empID" id="empID" size="30" class="input" maxlength="13">                                            
                    <input type="submit" name="submit" class="fix" value="Get details" id="submit" />
                </div>
        </form>
</div>
<!-- If query successful -->
<div class = "indent2">
<br/>
        <h3>11085802 (Werner Raath)</h3> 
        <div class="content_interior">			
            <table class = "table">
                    <tr class =  "head">
                            <td > Device ID </td>
                            <td > Device Model </td>
                            <td > Date Registered </td>
                            <td > Current Security Score </td>
                            <td > View Log </td>
                    </tr>
                    <!-- For every device display-->
                    <% int sizeMal = 5;
                        for (int i = 0; i < sizeMal; i++)
                            out.write("<tr>"+
                                            "<td > 123234535 </td>"+
                                            "<td > HTC Wildfire</td>"+
                                            "<td > 05/06/2014</td>"+
                                            "<td > 67% </td>"+
                                            "<td > <input type=\"button\"  value = \"View Log\" href=\"devLog.jsp\"> </td>"+
                                    "</tr>"); 
                    %>
            </table>
        </div>
</div>