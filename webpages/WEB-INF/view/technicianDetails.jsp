<div class = "indent2">
    <h1>11085802 (Werner Raath)</h1>
    <div class="content_interior">               

        <h2>Devices Registered: </h2>
        <table class = "table">
                <tr class ="head">
                        <td></td>
                        <td> <a> Device ID </a> </td>
                        <td> <a> Device Model </td>
                        <td> <a> Date Registered </td>
                        <td> <a> Current Security Score </td>
                </tr>
                <!-- For every device display-->
                <% int sizeReg = 5;
                    for (int i = 0; i < sizeReg; i++)
                        out.write("<tr>"+
                                        "<td></td>"+
                                        "<td> <a>  123234535</a> </td>"+
                                        "<td> HTC Wildfire</td>"+
                                        "<td> 05/06/2014</td>"+
                                        "<td> 67% </td>"+
                                "</tr>"); 
                %>
        </table>
        <h2>Devices Fixed: </h2>
        <table class = "table">
                <tr class ="head">
                        <td><a> Device ID </a></td>
                        <td><a> Device Model </a></td>
                        <td><a> Date Fixed </a></td>
                        <td ><a> Initial Security Score </a></td>
                        <td ><a> Current Security Score </a></td>
                </tr>
                <!-- For every device display-->
                <% int sizeScans = 5;
                    for (int i = 0; i < sizeScans; i++)
                        out.write("<tr>"+
                                        "<td> <a>123234535 </a></td>"+
                                        "<td> HTC Wildfire</td>"+
                                        "<td> 05/06/2014</td>"+
                                        "<td> 67% </td>"+
                                        "<td> 85% </td>"+
                                "</tr>"); 
                %>
        </table>
        <h2>Blacklisted Applications History: </h2>
        <table class = "table">
                <tr class ="head">
                        <td><a> Device ID </a></td>
                        <td><a> Device Model </a></td>
                        <td><a> Date of Operation </a></td>
                        <td><a> Operation Type </a></td>
                        <td><a> Security Penalty </a></td>
                </tr>
                <!-- For every device display-->
                <% int sizeBlack = 5;
                    for (int i = 0; i < sizeBlack; i++)
                        out.write("<tr>"+
                                        "<td><a> 123234535 </a></td>"+
                                        "<td> Facebook</td>"+
                                        "<td> 05/06/2014</td>"+
                                        "<td> Added </td>"+
                                        "<td> -2% </td>"+
                                "</tr>"); 
                %>
        </table>
    </div>
</div>
