package org.jeecg.modules.api.controller;

//import org.jeecg.modules.api.feignclient.DockerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 服务化 system模块 对外接口请求类
 */
@RestController
@RequestMapping("/sys/api")
public class SystemAPIController {

//
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DockerApi dockerApi;

    /**
     * 发送系统消息
     */
    @GetMapping("/")
    public String sendSysAnnouncement(HttpServletResponse httpResponse) throws IOException {

        System.out.println("HellWorld!");

//        String result = dockerApi.sendSysAnnouncement();

//        String result = restTemplate.getForObject("http://docker-test/docker-test/sys/api/",String.class);
//
//        System.out.println("测试：" + result);
//        return null;
        return "HellWorld!";
    }


}
