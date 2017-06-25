package com;
import home.*;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HomeWorkTask4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		Home home = new Home();
		home.countBoards = 1000;
		home.countWindow = 12;
		Board board = new Board();
		Window window = new Window();
		String s = req.getParameter("board");
		board.count = Integer.parseInt(s);
		String q = req.getParameter("window");
		window.count = Integer.parseInt(q);
		boolean err = false;
		int b = home.addBoard(board), w = home.addWindow(window);
		if(b == 1)
		{err = true;resp.getWriter().println("����, �������� - " + (home.countBoards)+" �����</br>");}
		else
			resp.getWriter().println("����� �������</br>");
		if(w == 1)
			{err = true; resp.getWriter().println("����, �������� - " + (home.countWindow)+" ����</br>");}
			else
				resp.getWriter().println("���� �������</br>");
		resp.getWriter().println(!err ? "��� ��������!" : "��� �� ��������!");
	}
}
