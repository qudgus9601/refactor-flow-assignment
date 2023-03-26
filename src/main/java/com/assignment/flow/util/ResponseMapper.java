package com.assignment.flow.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class ResponseMapper {
    public Map<String,Object> messageAndData(String message, Object data) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> response = new HashMap<>();
        response.put("message",message);
        response.put("data",data);
        System.out.println(objectMapper.writeValueAsString(response));
        return response;
    }
}
