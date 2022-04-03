package com.hy.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResultMessage {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResultMessage.class);

    private static final String SUCCESS = "SUCCESS";
    private static final String ERROR = "ERROR";

    String resultStatus;
    boolean isError;
    Map<String, Object> data = new HashMap<>();
}
