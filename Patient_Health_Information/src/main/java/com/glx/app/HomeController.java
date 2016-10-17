package com.glx.app;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private Servic serv;
	Map<String,Integer>medMap=new HashMap<String, Integer>();
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("register","pat",new Patient());
			
		
	}
	int getRandomId()
	{
		double d=Math.random();
		int id=(int) (10000*d);
		return id;
	}
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView reg(@Valid @ModelAttribute("pat") Patient pat,BindingResult bindingResult ) {
		if(bindingResult.hasErrors())
			return new ModelAndView("register");
		String meds=pat.getMedicins();
		meds.trim();
		String medsArr[]=meds.split("\\s");
		List<Medicine> m=new ArrayList<Medicine>();
		
		
		for(int i=0;i<medsArr.length;i++)
		{
			System.out.println(medsArr[i]+"  ");
			Medicine medcin=new Medicine();
			medcin.setMname(medsArr[i]);
			if(medMap.containsKey(medsArr[i])){
				medcin.setMid(medMap.get(medsArr[i]));
				System.out.println("same"+medMap.get(medsArr[i]));
			}
			else{
				int xx=getRandomId();
				System.out.println(xx+"  ");
				medcin.setMid(xx);
				medMap.put(medsArr[i],xx);
			}
			//System.out.println(medsArr[i]+" "+getRandomId());
			m.add(medcin);
		}

		pat.setMedicines(m);
		
		
		serv.save(pat);
		return new ModelAndView("home","msg","SuccessFully Registered");
		
	}
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ModelAndView Login( @RequestParam("pid") int pid,@RequestParam("password") String password) {
		
		Patient p=serv.check(pid,password);
		if(p==null)
			return new ModelAndView("login","msg","Wrong Id Or Pasword");

		return new ModelAndView("success","pat",p);
		
	}
	@RequestMapping(value = "/LoginAgain", method = RequestMethod.POST)
	public ModelAndView LoginAgain(@ModelAttribute("pat")Patient pat){
		return new ModelAndView("home","pat",pat);
	}
	@RequestMapping(value = "/medicine", method = RequestMethod.GET)
	public ModelAndView med(@RequestParam("med") int id)
	
	{
		System.out.println(id);
		List<Patient> lp=serv.getUsers(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("show");
		mav.addObject("mid", id);
	mav.addObject("list",lp);
	return mav;
		
	}
}
