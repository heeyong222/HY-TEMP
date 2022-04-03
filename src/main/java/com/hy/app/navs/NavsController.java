package com.hy.app.navs;

import com.hy.app.entity.ResultMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@CrossOrigin
@RequestMapping(path="/navs")
public class NavsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NavsController.class);

    @Autowired
    NavsService navsService;


    @PostMapping("/find")
    public ResponseEntity<ResultMessage> find(Map<String, Object> map){
        return new ResponseEntity<ResultMessage>(HttpStatus.OK);
    }




}
