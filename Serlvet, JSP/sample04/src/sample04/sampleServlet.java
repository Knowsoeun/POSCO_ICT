package sample04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sampleServlet extends HttpServlet {

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SampleServelet doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SampleServelet doPost");
	}

}
