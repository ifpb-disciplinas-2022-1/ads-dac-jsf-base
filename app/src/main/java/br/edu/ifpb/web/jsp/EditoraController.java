package br.edu.ifpb.web.jsp;

import br.edu.ifpb.domain.Editora;
import br.edu.ifpb.domain.Editoras;
import br.edu.ifpb.infra.EditorasEmJDBC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// MCV - HTML (View) -> Servlet (Controller) -> Editora (Model)
@WebServlet(name = "EditoraController", urlPatterns = "/editoras.do")
public class EditoraController extends HttpServlet {
    private Editoras editoras = new EditorasEmJDBC();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //atendendo ao processamento
        request.setAttribute("editoras",editoras.todas());
        //redicionar à página
        request.getRequestDispatcher("listar.jsp")
                .forward(request, response); //mantendo a requisição original
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //atendendo ao processamento
        String localDeOrigem = req.getParameter("localDeOrigem");
        String nomeFantasia = req.getParameter("nomeFantasia");
        editoras.nova(new Editora(localDeOrigem, nomeFantasia));
        //redicionar à página
        resp.sendRedirect("editora.do"); //gerando uma nova requisição
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
