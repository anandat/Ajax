

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentInfo
 */
@WebServlet("/StudentInfo")
public class StudentInfo extends   {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("***STUDENT iNFO****");
		String roll=request.getParameter("roll");
		PrintWriter out=response.getWriter();
		response.setContentType("text/xml");
		System.out.println(getResult(roll));
		out.println(getResult(roll));
	}
	public String getResult(String roll)
	{
		String name="";
		String hostel="";
		String contact="";
		if(roll.equalsIgnoreCase("110"))
		{
			name="Ravi Kumar"; hostel="Earth"; contact="1234567890";
			
		}
		else if(roll.equalsIgnoreCase("120")){
			name="Renu Yadav"; hostel="mercury" ; contact="23456789809";
			}
		else{
			name ="Roll number not found";
		}
		String result="<Students>";
		result+="<Student>"; result+="<Name>" + name + "</Name>";
		result+="<Hostel>" + hostel + "</Hostel>";
		result+="<Contact>" + contact + "</Contact>";
		result+="</Student>"; result+="</Students>";
		
		return result;		
		 

	}

}
