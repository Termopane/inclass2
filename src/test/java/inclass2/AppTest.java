package inclass2;

import inclass2.Domain.Student;

import inclass2.Repository.StudentRepo;
import inclass2.Validator.StudentValidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

        @Test
        public void testAddStudent() {
            StudentRepo studentRepo = new StudentRepo(new StudentValidator(),"C:\\Users\\mures\\IdeaProjects\\inclass2\\src\\main\\java\\inclass2\\studenti.xml");
            Student student = new Student("6","grebla ion", 935, "giie2365@scs.ubbcluj.ro", "Pineaple Triptofan");
            assertNull(studentRepo.save(student));
            studentRepo.delete("6");
        }

        @Test
            public void testAddStudentFail() {
            StudentRepo studentRepo = new StudentRepo(new StudentValidator(),"C:\\Users\\mures\\IdeaProjects\\inclass2\\src\\main\\java\\inclass2\\studenti.xml");
            Student student = new Student("9","alin suleiman", 935, "asie2367@scs.ubbcluj.ro", "Alahambra Mango");
            assertEquals(student.getID(), studentRepo.save(student).getID());
            assertEquals(student.getNume(), studentRepo.save(student).getNume());
            assertEquals(student.getGrupa(), studentRepo.save(student).getGrupa());
            assertEquals(student.getMail(), studentRepo.save(student).getMail());
            assertEquals(student.getProfesor(), studentRepo.save(student).getProfesor());
        }


}
