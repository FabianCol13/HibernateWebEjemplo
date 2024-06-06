package com.sena.controlador;
import com.sena.domain.User;
import com.sena.servicio.UserService;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;


public class ServletControlador extends HttpServlet {

    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         UserService userService;
        userService = new UserService();
        List<User> users = userService.ListarUsuarios();

        request.setAttribute("users", users);
        System.out.println("users" + users);
        try {
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);    
        } catch (ServletException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
   
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
