package controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import model.RealState;
import model.Record;
import model.User;
//import service.RealStateService;
import service.RecordService;
import service.UserService;

@Controller
public class FormController {

private static final Logger logger = Logger.getLogger(FormController.class);
	
	public FormController() {
		System.out.println("FormController()");
	}

    @Autowired
    private RecordService recordService;
    @Autowired
    private UserService userService;
    @Autowired
  //  private RealStateService realStateService;
    
    @RequestMapping(value = {"getAllUsers", "/"})
    public ModelAndView getAllUsers() {
    	logger.info("Getting the all Employees.");
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("userList", "userList", userList);
    }
    
    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public ModelAndView saveRecord(@ModelAttribute Record record, BindingResult result) {
    	recordService.createRecord(record);
		return null;
    }
}
