package nl.knowable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Diana on 4/29/2017.
 */
@Controller
public class MainController {
    private final Logger slf4jLogger = LoggerFactory.getLogger(MainController.class);

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




}
