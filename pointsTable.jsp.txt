<%@ page import="java.util.*, com.ipl.Team" %>
<!DOCTYPE html>
<html>
<head>
    <title>IPL Points Table</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<h1>IPL 2024 Points Table</h1>

<table>
    <tr>
        <th>Team</th>
        <th>Matches</th>
        <th>Wins</th>
        <th>Losses</th>
        <th>Points</th>
        <th>NRR</th>
    </tr>

<%
    ArrayList<Team> teams = (ArrayList<Team>) request.getAttribute("teams");
    for (Team team : teams) {
%>
    <tr>
        <td><%= team.getName() %></td>
        <td><%= team.getMatches() %></td>
        <td><%= team.getWins() %></td>
        <td><%= team.getLosses() %></td>
        <td><%= team.getPoints() %></td>
        <td><%= team.getNrr() %></td>
    </tr>
<%
    }
%>

</table>

</body>
</html>
