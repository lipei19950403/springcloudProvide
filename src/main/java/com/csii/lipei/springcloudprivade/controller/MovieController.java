package com.csii.lipei.springcloudprivade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
	
	@RequestMapping("/SolrSearch")
    public String SolrSearch(){
        return "这里是Solr";
    }
	
}
