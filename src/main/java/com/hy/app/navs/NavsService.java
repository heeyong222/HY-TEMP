package com.hy.app.navs;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hy.app.entity.ResultMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NavsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NavsService.class);


    public ResultMessage find(Map<String, Object> map){

        ResultMessage rm = new ResultMessage();
        /*
        Map 파싱
        { 123.13251, 126.12313 },
         */
        JsonObject jo = new JsonObject();
        JsonArray ja = new JsonArray();
//        JsonArray ja = new Gson().json
        map.get("dests");










        return rm;
    }


}
