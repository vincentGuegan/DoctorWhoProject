package com.doctorwho.DoctorWhoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication

public class DoctorWhoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorWhoProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	
    public String index() {
		return
	"<ul>" + 
		"<li><a href=\"/doctor/1\">hartnell</a></li>" + 
		"<li><a href=\"/doctor/2\">tennant</a></li>" + 
		"<li><a href=\"/doctor/3\">whittaker</a></li>" + 
		"<li><a href=\"/doctor/4\">capalbi</a></li>" + 
	"</ul>";
    }

	@RequestMapping("/doctor/1")
	@ResponseBody

	public String hartnell() {
        return "William Hartnell";
    }

	@RequestMapping("/doctor/2")
	@ResponseBody

	public String tennant() {
        return "David Tennant";
    }

	@RequestMapping("/doctor/3")
	@ResponseBody

	public String whittaker() {
        return "Jodie Whittaker";
    }

	@RequestMapping("/doctor/4")
	@ResponseBody

	public String capalbi() {
        return "Peter Capalbi";
    }
}
