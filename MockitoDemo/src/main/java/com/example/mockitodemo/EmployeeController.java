package com.example.mockitodemo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

@RequestMapping("/employee")
@CrossOrigin("*")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@Autowired
	SpringTemplateEngine springTemplateEngine;

	@GetMapping("/generatePdf")
	public ResponseEntity<Object> generatePdf() throws IOException {

		String finalHtml = "";

		finalHtml = "<!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n" + "\r\n"
				+ "    <title>My Demo Page</title>\r\n" + "    <style>\r\n" + "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n" + "            margin: 20px;\r\n" + "        }\r\n"
				+ "\r\n" + "        header {\r\n" + "            background-color: #333;\r\n"
				+ "            color: white;\r\n" + "            text-align: center;\r\n"
				+ "            padding: 10px;\r\n" + "        }\r\n" + "\r\n" + "        section {\r\n"
				+ "            margin: 20px 0;\r\n" + "        }\r\n" + "\r\n" + "        footer {\r\n"
				+ "            background-color: #333;\r\n" + "            color: white;\r\n"
				+ "            text-align: cent"
				+ ""
				+ "er;\r\n" + "            padding: 10px;\r\n"
				+ "            position: fixed;\r\n" + "            bottom: 0;\r\n" + "            width: 100%;\r\n"
				+ "        }\r\n" + "    </style>\r\n" + "</head>\r\n" + "<body>\r\n" + "\r\n" + "    <header>\r\n"
				+ "        <h1>Welcome to My Demo Page</h1>\r\n" + "    </header>\r\n" + "\r\n" + "    <section>\r\n"
				+ "        <h2>About Me</h2>\r\n" + "        <p>This is a demo page to showcase HTML and CSS.</p>\r\n"
				+ "    </section>\r\n" + "\r\n" + "    <section>\r\n" + "        <h2>My Interests</h2>\r\n"
				+ "        <ul>\r\n" + "            <li>Web Development</li>\r\n"
				+ "            <li>Programming</li>\r\n" + "            <li>Design</li>\r\n" + "        </ul>\r\n"
				+ "    </section>\r\n" + "\r\n" + "    <footer>\r\n"
				+ "        <p>&copy; 2023 My Demo Page. All rights reserved.</p>\r\n" + "    </footer>\r\n" + "\r\n"
				+ "</body>\r\n" + "</html>\r\n" + "";

		empService.htmlToPdf(finalHtml);

		return ResponseEntity.ok("Success");

	}

}
