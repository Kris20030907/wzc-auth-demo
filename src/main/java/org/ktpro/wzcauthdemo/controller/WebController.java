package org.ktpro.wzcauthdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WZC
 * @description
 * @create 2024-09-18 14:19
 * @qq 3185633428
 * @wechat 18155431447
 */

@RestController
public class WebController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World，I'm wzc";
    }
}
