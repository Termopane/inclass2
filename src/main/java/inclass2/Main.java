package inclass2;

import inclass2.Repository.NoteRepo;
import inclass2.Repository.StudentRepo;
import inclass2.Repository.TemeRepo;
import inclass2.Service.ServiceNote;
import inclass2.Service.ServiceStudent;
import inclass2.Service.ServiceTeme;
import inclass2.UI.UI;
import inclass2.Validator.NotaValidator;
import inclass2.Validator.StudentValidator;
import inclass2.Validator.TemeValidator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        StudentRepo rep=new StudentRepo(new StudentValidator(),"C:\\Users\\mures\\IdeaProjects\\inclass2\\src\\main\\java\\inclass2\\studenti.xml");
        TemeRepo repo=new TemeRepo(new TemeValidator(),"C:\\Users\\mures\\IdeaProjects\\inclass2\\src\\main\\java\\inclass2\\teme.xml");
        NoteRepo r=new NoteRepo(new NotaValidator());
        ServiceStudent srv=new ServiceStudent(rep);
        ServiceTeme serv=new ServiceTeme(repo);
        ServiceNote sv=new ServiceNote(r);
        UI ui=new UI(srv,serv,sv);
        ui.show();

    }
}
