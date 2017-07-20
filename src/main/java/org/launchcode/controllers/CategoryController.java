package org.launchcode.controllers;

import org.launchcode.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by davidprince on 7/20/17.
 */
@Controller //Annotation that indicates this is a controller
@RequestMapping("category") //Controls this URL and subs
public class CategoryController {

    @Autowired // Creating a class that implements CategoryDao and putting one of those objects in the categoryDao field
    private CategoryDao categoryDao;


}
