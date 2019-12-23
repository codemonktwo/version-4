package CRUD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.DB_Connection1;


@WebServlet("/sq")
public class Payment_servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String shirts = (String) request.getAttribute("shirts");
		System.out.println(shirts);
		response.sendRedirect("book.jsp");
		String pickupdate = (String) request.getAttribute("pickupdate");
		System.out.println(pickupdate);
		/*DB_Connection1 obj_DB_Connection1=new DB_Connection1();
		Connection connection=obj_DB_Connection1.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into register1 values('"+name+"','"+email+"','"+mobno+"','"+psw+"','"+repeat_psw+"','"+city+"','"+address+"');";
			 ps=connection.prepareStatement(query);
			 ps.executeUpdate();
	} catch (Exception e) {
		 System.err.println(e);
		}*/
		
	}

}
