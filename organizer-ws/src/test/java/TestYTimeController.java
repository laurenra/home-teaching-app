//package java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.ldr.ht.YTimeController;
import org.ldr.ht.model.Person;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laurenra on 12/21/16.
 */
public class TestYTimeController extends TestCase {

    private YTimeController controller;
    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        controller = new YTimeController();
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testPrintIndexRequestView() throws Exception {
        ModelAndView modelAndView = controller.printIndex(null, null);
        assertEquals("index", modelAndView.getViewName());
    }

    @Test
    public void testPrintHelloRequestView() throws Exception {
        ModelAndView modelAndView = controller.printHello(null, null);
        assertEquals("hello", modelAndView.getViewName());
    }

    public void testGetPerson() {
        Person person = controller.getPerson();
        try {
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testMinutesToHHMM() throws Exception {
        String hhmm = controller.minutesToHHMM(532);
        assertEquals("8:52", hhmm);
    }
}
