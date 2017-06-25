package com;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HomeWorkTask2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		p.setCharacterEncoding("UTF-8");
		//------------------------------Task1------------------------------------
		String var1 = req.getParameter("var1");
		String var2 = req.getParameter("var2");
		double num1 = Double.parseDouble(var1);
		double num2 = Double.parseDouble(var2);
		resp.getWriter().println("Task1");
		resp.getWriter().println(Math.abs(num1-10) > Math.abs(num2-10) ? num2 : num1);
		//-----------------------------Task2--------------------------------------
		resp.getWriter().println("Task2");
		String ina = req.getParameter("a");
		String inb = req.getParameter("b");
		String inc = req.getParameter("c");
		int a = Integer.parseInt(ina);
		int b = Integer.parseInt(inb);
		int c = Integer.parseInt(inc);
		int d = b*b-4*a*c;
		resp.getWriter().println(d > 0 ? (-b+Math.sqrt(d))/(2*a)+"\n"+(-b-Math.sqrt(d))/(2*a) : "NO");
		//--------------------------------Task3----------------------------------------
		resp.getWriter().println("Task3");
		int[][] arr = new int[8][5];
		int max = 0;
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				arr[i][j] = 10 + (int) (Math.random() * 90);
				if (arr[i][j] > max) max = arr[i][j];
				resp.getWriter().print(arr[i][j]+" ");
			}
			resp.getWriter().println();
		}
		//--------------------------------Task4------------------------------------
		resp.getWriter().println("Task4");
		resp.getWriter().println(max);
		//------------------------------Task6--------------------------------------
		resp.getWriter().println("Task6");
		var1 = req.getParameter("hex");
		int hex = Integer.parseInt(var1);
		String convert = Integer.toHexString(hex);
        resp.getWriter().println(convert);
        //----------------------------------Task7-------------------------------
        resp.getWriter().println("Task7");
        String line = req.getParameter("str");
        String[] words = line.split("\\s+"); // разделяем строку на слова
		resp.getWriter().println("Unsorted: " + Arrays.toString(words));
		Arrays.sort(words);
		resp.getWriter().println("Sorted: " + Arrays.toString(words));

	}
}
