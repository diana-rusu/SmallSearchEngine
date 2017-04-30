package nl.knowable.controller;

import nl.knowable.model.Text;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Diana on 4/29/2017.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String apage() {
        return "views/add";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "views/list";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public
//    @ResponseBody
//    Text addData(@RequestBody Text newScenario) {
//
//        return "views/add";
//    }


}
