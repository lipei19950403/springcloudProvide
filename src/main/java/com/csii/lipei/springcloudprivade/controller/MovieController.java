package com.csii.lipei.springcloudprivade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.csii.lipei.springcloudprivade.entity.User;

@RestController
public class MovieController {
	
	//无参数接受请求
	@RequestMapping("/SolrSearch")
    public User SolrSearch(){
        return new User("lipei", "12345");
    }
	
	//有参数接受请求
	@RequestMapping("/SolrSearchById/{id}")
	public User SolrSearchById(@PathVariable(name = "id")String id) {
		 return new User("lipei", id);
	}
	
	
}
