import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.security.auth.Subject;

import java.util.LinkedList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(JUnitParamsRunner.class)
public class SubjectTest {

    Subject subject;
    List<Double> gradesList;



    @Before

    public void before() {
        subject = new Subject();
        gradesList = new LinkedList<Double>();
    }

    @Test

    public void createSubjectTest() {

        assertNotNull(subject);
    }

    @Test

    public void calculatingAverageTest() {
        Subject subject = new Subject();

        gradesList.add(4.0);
        gradesList.add(5.0);

//        assertEquals(4.5, subject.ge);

    }


}
