package com.eedanna.common.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The Class HelloController.
 */
@Controller
public class HelloController {

	/**
	 * Prints the welcome.
	 *
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", message);		
		return "hello";

	}

	/**
	 * Hi.
	 *
	 * @param name
	 *            the name
	 * @param model
	 *            the model
	 * @return the string
	 */
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(@RequestParam("name") String name, Model model) {
		String message = "Hello " + name + "!";
		model.addAttribute("message", message);
		return "hi";
	}

	/** The message. */
	@Value("${springHellowWord}")
	private String message;
	
	/**
	 * Hello.
	 *
	 * @return the string
	 */
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
}
