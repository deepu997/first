package info.inetsolv;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/* This is my first controller*/
@Controller
public class FirstController {

	public ModelAndView first(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("first", "hello");
		return mav;
		
	}
}
