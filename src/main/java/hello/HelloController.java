package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.security.Principal;

@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView getHomePage(){
			return new ModelAndView("hello");
	}

}
