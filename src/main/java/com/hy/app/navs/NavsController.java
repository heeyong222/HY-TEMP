package com.hy.app.navs;

import com.hy.app.entity.ResultMessage;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@CrossOrigin
@Slf4j
@RequestMapping(path="/navs")
public class NavsController {

    private final static Logger LOGGER = LoggerFactory.getLogger(NavsController.class);

    @Autowired
    NavsService navsService;




    @PostMapping("/find")
    public ResponseEntity<ResultMessage> find(@RequestBody Map<String, Object> map){
        LOGGER.debug(">>> API find - param : {}", map.toString());
        System.out.println("!@#!@#!@#");
        ResultMessage rm = null;




        return new ResponseEntity<ResultMessage>(rm, HttpStatus.OK);
    }




}
