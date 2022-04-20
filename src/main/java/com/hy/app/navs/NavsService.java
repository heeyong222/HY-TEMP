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
        { R : 123.13251, C : 126.12313 },
         */
        JsonObject jo = new JsonObject();
        JsonArray rcArr = new JsonArray();
        rcArr = (JsonArray) map.get("dests");
        LOGGER.info(">>> 좌표 리스트 : {}", rcArr.toString());

        for(int i = 0; i < rcArr.size(); i++){
            JsonObject rc = rcArr.get(i).getAsJsonObject();


        }









        return rm;
    }


}
