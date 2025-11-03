/**
 *
 */
package com.rslakra.nomen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rohtash Lakra
 */
@RestController
public class HomeController {

    private StringBuilder sBuilder;

    @GetMapping(value = "/")
    public String home() {
        if (sBuilder == null) {
            sBuilder = new StringBuilder();

            sBuilder.append("<!DOCTYPE html>");
            sBuilder.append("<html lang=\"en\">");
            sBuilder.append("<head>");
            sBuilder.append("<title>Names</title>");
            sBuilder.append("<meta charset=\"UTF-8\">");
            sBuilder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            sBuilder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" />");
            sBuilder.append("</head>");
            sBuilder.append("<body>");
            sBuilder.append("<div class=\"header\">");
            sBuilder.append("<h1>Names</h1>");
            sBuilder.append("<p>");
            sBuilder.append("A <b>responsive</b> names website created by me.");
            sBuilder.append("</p>");
            sBuilder.append("</div>");
            sBuilder.append("<div class=\"navbar\">");
            sBuilder.append("<a href=\"#\" class=\"active\">Home</a> <a href=\"#\">Names</a> <a href=\"#\">Next</a>");
            sBuilder.append("<a href=\"#\" class=\"right\">Logout</a>");
            sBuilder.append("</div>");
            sBuilder.append("<div class=\"row\">");
            sBuilder.append("<div class=\"side\">");
            sBuilder.append("<h2>About Me</h2>");
            sBuilder.append("<h5>My Photo</h5>");
            sBuilder.append("<div class=\"fakeimg\" style=\"height: 200px;\">Image</div>");
            sBuilder.append("<p>Some text about me!.</p>");
            sBuilder.append("<h3>More Text</h3>");
            sBuilder.append("<p>You can write here whatever you wish to.</p>");
            sBuilder.append("<div class=\"fakeimg\" style=\"height: 60px;\">Image</div>");
            sBuilder.append("<br>");
            sBuilder.append("<div class=\"fakeimg\" style=\"height: 60px;\">Image</div>");
            sBuilder.append("<br>");
            sBuilder.append("<div class=\"fakeimg\" style=\"height: 60px;\">Image</div>");
            sBuilder.append("</div>");
            sBuilder.append("<div class=\"main\">");
            sBuilder.append("<h2>Spring</h2>");
            sBuilder.append("<h5>Spring Annotations</h5>");
            sBuilder.append("<div class=\"fakeimg\" style=\"height: 200px;\">Image</div>");
            sBuilder.append("<p>Spring MVC Annotations.</p>");
            sBuilder.append(
                    "<p>Spring MVC @RequestMapping Annotation Example with Controller, Methods, Headers, Params, @RequestParam, @PathVariable</p>");
            sBuilder.append("<br> <br> <br>");
            sBuilder.append("<h2>@RequestMapping</h2>");
            sBuilder.append(
                    "<p> @RequestMapping is one of the most widely used Spring MVC annotation. <code> org.springframework.web.bind.annotation.RequestMapping</code> annotation is used to map web requests onto specific handler classes and/or handler methods.");
            sBuilder.append("</div>");
            sBuilder.append("</div>");
            sBuilder.append("<div class=\"footer\">");
            sBuilder.append("<h2>@Rohtash Lakra</h2>");
            sBuilder.append("</div>");
            sBuilder.append("</body>");
            sBuilder.append("</html>");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");
            sBuilder.append("");

        }

        return sBuilder.toString();
    }

}
