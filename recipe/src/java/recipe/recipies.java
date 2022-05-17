
package recipe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aamir
 */
public class recipies extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          if("1/4".equals(request.getParameter("selection"))){
                 Ingredients ingredients1 = new Ingredients("banana","1/2",1);
            
            request.setAttribute("ingredients1", ingredients1);
            
            
            
            Recipe Recipe1 = new Recipe();
//            Recipe1.addIngredient(ingredients1);
            Recipe1.multiplyByQuarter();
            request.setAttribute("Recipe1", Recipe1);
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);

            }
            else if("1/2".equals(request.getParameter("selection"))){
                 Ingredients ingredients1 = new Ingredients("banana","1/2",1);
            
            request.setAttribute("ingredients1", ingredients1);
            
            
            
            Recipe Recipe1 = new Recipe();
//            Recipe1.addIngredient(ingredients1);
            Recipe1.multiplyByHalf();
            request.setAttribute("Recipe1", Recipe1);
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);

            }
                if("1".equals(request.getParameter("selection"))){
                 Ingredients ingredients1 = new Ingredients("banana","1/2",1);
           
            request.setAttribute("ingredients1", ingredients1);
            
            
            
            Recipe Recipe1 = new Recipe();
            Recipe1.multiplyByone();
//            Recipe1.addIngredient(ingredients1);
            request.setAttribute("Recipe1", Recipe1);
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);

            }
                    if("2".equals(request.getParameter("selection"))){
                 Ingredients ingredients1 = new Ingredients("banana","1/2",1);
            
            request.setAttribute("ingredients1", ingredients1);
            
            
            
            Recipe Recipe1 = new Recipe();
//            Recipe1.addIngredient(ingredients1);
            Recipe1.multiplyBytwo();
            request.setAttribute("Recipe1", Recipe1);
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);

            }
                       if("3".equals(request.getParameter("selection"))){
                 Ingredients ingredients1 = new Ingredients("banana","1/2",1);
            
            request.setAttribute("ingredients1", ingredients1);
            
            
            
            Recipe Recipe1 = new Recipe();
//            Recipe1.addIngredient(ingredients1);
            Recipe1.multiplyBythree();
            request.setAttribute("Recipe1", Recipe1);
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);

            }
                          if("4".equals(request.getParameter("selection"))){
                 Ingredients ingredients1 = new Ingredients("banana","1/2",1);
            
            request.setAttribute("ingredients1", ingredients1);
            
            
            
            Recipe Recipe1 = new Recipe();
//            Recipe1.addIngredient(ingredients1);
            Recipe1.multiplyByfour();
            request.setAttribute("Recipe1", Recipe1);
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);

            }
                    
            
           else if("Form".equals(request.getParameter("action"))){
                 String url = "/Form.jsp";
            getServletContext().getRequestDispatcher(url).forward(request, response);
            }
          
            else{
            
            Ingredients ingredients1 = new Ingredients("banana","2",4);
            request.setAttribute("ingredients1", ingredients1);
            
            ArrayList<Ingredients> foods = new ArrayList<>();
            foods.add(ingredients1);
            
            Recipe Recipe1 = new Recipe(foods);
            request.setAttribute("Recipe1", Recipe1);
            
            
            
            getServletContext().getRequestDispatcher("/recipe.jsp").forward(request, response);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

