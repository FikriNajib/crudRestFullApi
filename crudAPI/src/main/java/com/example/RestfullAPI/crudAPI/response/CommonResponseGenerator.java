/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestfullAPI.crudAPI.response;

import org.springframework.stereotype.Component;

/**
 *
 * @author Mo
 * @param <T>
 */
@Component
public class CommonResponseGenerator<T> {

    public <T> CommonResponse<T> successResponse(T datas, String message) {
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("200");
        commonResponse.setMessage(message);
        commonResponse.setDatas(datas);

        return commonResponse;
    }

    public <T> CommonResponse<T> failedResponse(String message) {
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("500");
        commonResponse.setMessage(message);

        return commonResponse;
    }
}
