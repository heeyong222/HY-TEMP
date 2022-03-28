package com.hy.app.navs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path="/navs")
public class NavsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NavsController.class);



}
