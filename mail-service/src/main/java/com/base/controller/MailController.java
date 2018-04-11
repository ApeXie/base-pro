package com.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br></br>
 *
 * @version 1.0
 * @author: XieNengYan
 * @email 373309446@qq.com
 * @date: 2018/4/11 10:50
 */
@RestController
public class MailController {

    @RequestMapping(value = "/test")
    String test(){
        return "test";
    }
}
