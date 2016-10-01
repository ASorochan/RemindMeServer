package com.anatoly.remindme.server.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by anatoly on 01.10.16.
 */

@Controller
@RequestMapping("/remind")

public class ReminderController {


    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model) {
        return  "My reminder";
    }
}