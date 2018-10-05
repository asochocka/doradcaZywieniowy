package com.doradca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doradca.model.Dietetyk;
import com.doradca.repository.DietetykRepository;
//import com.doradca.service.DietetykService;


@Controller
public class PageConroller {
	
	@Autowired
	private DietetykRepository dietetykRepository;
	
	
	//@GetMapping("/")
	@RequestMapping("/")
    @ResponseBody
	
    public String mainPage() {
        return "Hello World Ani!";
    }
	
  @RequestMapping("/hello")
  @ResponseBody
	
	//@GetMapping("/hello")
    public String pageTwo() {
        return "Hi Ani!";
    }
	
	@RequestMapping("/all-dietetycy")
     @ResponseBody
     
     
     public String testMethod() {
         StringBuilder response = new StringBuilder();
  
         Dietetyk dietetyk = new Dietetyk()
                 .withImie("Ania")
                 .withNazwisko("Sochocka")
                 .withOpis("starszy dietetyk");
                 
         dietetykRepository.save(dietetyk);
  
         for(Dietetyk i: dietetykRepository.findAll()) {
             response.append(i).append("<br>");
         }
  
         return response.toString();
     }
	
   // @GetMapping("/all-dietetycy")
    //public String allDietetycy() {
     //   return dietetykRepository.findAll().toString();
   // }

}
