package controller;
import entities.Categorie;
import entities.Marque;
import entities.Produit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import service.ProduitService;
import service.UserService;

/**
 *
 * @author Lachgar
 */
@WebServlet(urlPatterns = {"/FileUploadHandler"})
public class ImageUploader extends HttpServlet {

    private int id;
    private String nom, designation, description;
    private double prix;
    private int unite;
    private Categorie categorie;
    private Marque marque; 
    String path;
    private String UPLOAD_DIRECTORY = "/WeSellThings/web/ressource/image/";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UPLOAD_DIRECTORY = getServletContext().getRealPath("/").replace("build\\", "") + "ressource" + File.separator + "images";
        //process only if its multipart content
        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest((RequestContext) request);
                String image = null;
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        image = new File(item.getName()).getName();
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + image));
                        path = UPLOAD_DIRECTORY + File.separator + image;
                    } else {
                        InputStream input = item.getInputStream();
                        if (item.getFieldName().equals("nom")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            nom = new String(str, "UTF8");
                        }
                        if (item.getFieldName().equals("designation")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            designation = new String(str, "UTF8");
                        }
                        if (item.getFieldName().equals("description")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            description = new String(str, "UTF8");
                        }
                    }
                }
                //File uploaded successfully

                ProduitService ps = new ProduitService();
                ps.create(new Produit(nom,designation,image,description,prix,unite,categorie,marque));

                request.setAttribute("message", "File Uploaded Successfully le nom est :" + nom + " la designation est :" + designation);
            } catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
            }
        } else {
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");
        }

        //request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

}
