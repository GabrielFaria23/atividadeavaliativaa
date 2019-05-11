
import java.io.IOException;
import java.util.Scanner;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean (name="up")
@ViewScoped
public class FileUploadView {
     
    private UploadedFile file;
    private String a;
     
    public void handleFileUpload(FileUploadEvent event) throws IOException {
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        a = new Scanner(event.getFile().getInputstream(),"UTF-8").useDelimiter("\\A").next();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    
}