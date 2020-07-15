package com.atguigu.gmall0213.gmall0213logger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Corgi
 * @create 2020-07-16 0:06
 */
@RestController
public class LoggerController {

    @RequestMapping("/applog")
    public String applog(){
        return "success";
    }

}
