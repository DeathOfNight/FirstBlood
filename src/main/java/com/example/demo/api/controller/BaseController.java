package com.example.demo.api.controller;

import com.example.demo.data.Pay;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@RestController
public class BaseController {

   /* @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public ModelAndView getIndex() {
        return new ModelAndView("index");
    }*/

   /* @RequestMapping(value = "/form_layout" ,method = RequestMethod.GET)
    public ModelAndView getForm_layout() {
        return new ModelAndView("form_layout");
    }*/

    @RequestMapping(value = "/{viewName}" ,method = RequestMethod.GET)
    public ModelAndView getUrl(@PathVariable String viewName ) {

        return new ModelAndView(viewName);
    }

}
