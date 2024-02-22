package com.hm.web.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ZZH
 * @create 2024/2/22
 * @since 1.0.0
 */
@RestController
@Slf4j
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "scan.html";
    }
}