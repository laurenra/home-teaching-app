package org.ldr.ht;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ldr.ht.model.Person;
import org.ldr.ht.samples.SamplePerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laurenra on 12/16/16.
 */
@Controller
public class YTimeController {

    private static final Logger log = LoggerFactory.getLogger(YTimeController.class);

    public static final String ACAHOURS_DEEP_LINK = "hoursDeepLink2";
    public static final String TIMESHEET_DEEP_LINK = "timesheetDeepLink";

    private static final String PUNCHED_IN_MESSAGE="time.reporting.punched.in";
    private static final String PUNCHED_OUT_MESSAGE="time.reporting.punched.out";
    private static final String TIMECARD_EXCEPTION_MESSAGE = "time.reporting.timecard.exception";
    private static final String ERROR_MESSAGE_PARAM = "errorMessage";
    private static final String TIMECARD_NO_JOBS_MESSAGE = "time.reporting.nojobs.exception";
    private static final String INVALID_USER_MESSAGE = "time.reporting.invalid.user.exception";
    private static final String TIMEPUNCH_DELAY_MESSAGE = "time.reporting.delay.info";

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/ht/person", method = RequestMethod.GET)
    public @ResponseBody Person getPerson() {

        SamplePerson samplePerson = new SamplePerson();
        return samplePerson.makePerson1();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String printIndexOldWay(ModelMap model) {

        model.addAttribute("message", "This is the test page.");
        return "test"; // View name (index.jsp) without .jsp
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView printIndex(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "This is the homepage");
        return modelAndView;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView printHello(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        ModelAndView model = new ModelAndView("hello"); // view name (hello.jsp) without .jsp
        model.addObject("message", "Hello Spring MVC Framework.");
//        return "hello"; // hello.jsp
        return model;
    }

//    @RequestMapping(value = "/ytime", method = RequestMethod.GET)
//    public ModelAndView viewTime(HttpServletRequest request, HttpServletResponse response,
//                                 @RequestParam(value = "refresh", required = false) boolean refresh,
//                                 @RequestParam(value = ERROR_MESSAGE_PARAM, required = false) String errorMessage,
//                                 @RequestParam(value = "id", required = false) String id)
//        throws ServletException, IOException {
//
//        int weekTotal = 0;
//        int payPeriodTotal = 0;
//        String infoMessage = "";
//
//        String emplId = "123";
//        ModelAndView modelAndView = new ModelAndView("ytime");
//
//        if (errorMessage!=null) {
//            modelAndView.addObject("errorMessage", errorMessage);
//        }
//        infoMessage = messageSource.getMessage(TIMEPUNCH_DELAY_MESSAGE, null,"Expect a 2 to 5 minute delay.", request.getLocale());
//        modelAndView.addObject("infoMessage", infoMessage);
//
//        modelAndView.addObject("errorMessage", errorMessage);
//
//        return modelAndView;
//    }

    public String minutesToHHMM(int timeInMinutes) {
        return String.format("%d:%02d", timeInMinutes / 60, timeInMinutes % 60);
    }



}
