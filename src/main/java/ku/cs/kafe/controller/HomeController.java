package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pawat Puttimit 6410406827
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Waddee");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";
    }
}

