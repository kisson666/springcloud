package com.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by hppc on 2017/3/26.
 */
@RestController
public class controller01 {
    @Autowired
    DiscoveryClient client;

    @RequestMapping("/sentence")
    public String getSentence(){
        return getWord("mmb-eureka-client-subject") + " "
                + getWord("mmb-eureka-client-verb") + " "
                +getWord("mmb-eureka-client-subject");

    }

    public String getWord(String service){
        //System.out.println("30行");
        List<ServiceInstance> list = client.getInstances(service);
        //System.out.println(list+"32行");
        if (list !=null && list.size() > 0){
            URI uri = list.get(0).getUri();
            //System.out.println(uri); 这里显示只能获取到ip地址加端口号 如果想调用这个端口里的某一个controller方法 并不知道该怎么办
            if (uri !=null ){
                String res = new RestTemplate().getForObject(uri,String.class);
                System.out.println(res);
                return (new RestTemplate().getForObject(uri,String.class));
            }
        }
        return null;
    }
}
