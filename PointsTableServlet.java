package com.ipl;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/points")
public class PointsTableServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Team> teams = new ArrayList<>();

        teams.add(new Team("CSK", 14, 9, 5, 18, 0.652));
        teams.add(new Team("MI", 14, 8, 6, 16, 0.421));
        teams.add(new Team("RCB", 14, 7, 7, 14, 0.152));
        teams.add(new Team("KKR", 14, 6, 8, 12, -0.203));
        teams.add(new Team("SRH", 14, 5, 9, 10, -0.350));

        request.setAttribute("teams", teams);
        request.getRequestDispatcher("pointsTable.jsp").forward(request, response);
    }
}
