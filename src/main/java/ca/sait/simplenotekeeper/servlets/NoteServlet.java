
package ca.sait.simplenotekeeper.servlets;

import ca.sait.simplenotekeeper.javabeans.Note;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leila Nalivkina, Nick Hemnett
 */
public class NoteServlet extends HttpServlet {

	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String query = request.getQueryString();
		String path =  getServletContext().getRealPath("/WEB-INF/note.txt");

		BufferedReader br = new BufferedReader(new FileReader(new File(path)));

		String title = br.readLine();
		String contents = br.readLine();

		Note note = new Note (title, contents);

		request.setAttribute("note", note);

	if(query!=null && query.contains("create")) {
		//display create note
		getServletContext().getRequestDispatcher("/WEB-INF/createNote.jsp").forward(request, response);
	} else		
		if (query != null && query.contains("edit")) {
			//display edit note
			getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp").forward(request, response);
		} else {
			//display view note
			getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
		}
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String button = request.getParameter("btn");

		String path =  getServletContext().getRealPath("/WEB-INF/note.txt");

		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))){
			//for save option
			if(button.contentEquals("save")) {
				pw.println(title);
				pw.println(contents);	
			} else {
			//for delete option
				title = null;
				contents = null;
			} 
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		Note note = new Note (title, contents);

		request.setAttribute("note", note);

		getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
	}
}
