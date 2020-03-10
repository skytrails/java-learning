package com.sprint.boot.helloworld.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: spring boot helloworld$
 * @Param: $
 * @return: $
 * @Author: your name
 * @date: $
 */
@RestController
public class helloworld {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(helloworld.class);

    @RequestMapping("/")
    public String helloworld() {
        return "hello world! I'm a spring boot program.";
    }
}




