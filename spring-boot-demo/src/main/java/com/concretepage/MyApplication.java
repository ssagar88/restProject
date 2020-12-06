package com.concretepage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.concretepage.controller.ArticleInfo;


@SpringBootApplication   
//@EnableAutoConfiguration
//@EnableSwagger2
public class MyApplication {  
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		
		
		
		    //consume
		
//		    RestTemplate restTemplate = new RestTemplate();
//	        ArticleInfo quote = restTemplate.getForObject("http://localhost:8011/user/article/1", ArticleInfo.class);
//	        System.out.println(quote.getArticleId());
//	        System.out.println(quote.getCategory());
    }       
}            