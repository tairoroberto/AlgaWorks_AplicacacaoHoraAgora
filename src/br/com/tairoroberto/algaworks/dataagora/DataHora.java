package br.com.tairoroberto.algaworks.dataagora;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DataHora")
public class DataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public DataHora() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
		String dataHora = formatter.format(date);
		String html = ""
				+ "<html>"
				+ "<body>"
				+ "<h1> A data e hota atual:</h1>"
				+dataHora
				+ "</body>"
				+ "</html>";
		out.println(html);
		
	}

}
