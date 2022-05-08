package org.o7planning.simplewebapp.uploadfile;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/uploadFileResults")
public class UploadFileResultsServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;


   public UploadFileResultsServlet() {
       super();
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

       RequestDispatcher dispatcher
           = request.getServletContext().getRequestDispatcher("/WEB-INF/jsps/uploadFileResults.jsp");

       dispatcher.forward(request, response);
   }

}
