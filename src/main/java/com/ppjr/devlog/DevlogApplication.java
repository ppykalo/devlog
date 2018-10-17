
package com.ppjr.devlog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class DevlogApplication {

	@Autowired
	private BlogPostRepository blogPostRepository;
	
    @RequestMapping("/")
    String home() {
//    	BlogPost post = new BlogPost();
//    	post.setTitle("Jakis tytul");
//    	post.setContent("Jakas tam zawartosc");
//    	blogPostRepository.save(post);
//    	System.out.println("Created BlogPost with id = " + post.getId());
    	
    	String result = "<b>Blog posts:</b> <br/>";
    	
    	List<BlogPost> blogPosts = blogPostRepository.findAll();
    	
    	for (BlogPost blogPost : blogPosts) {
    		result += blogPost.getId() + ": " + blogPost.getTitle() + "<br/>";
    	}
    	
        return result;
    }

	public static void main(String[] args) {
		SpringApplication.run(DevlogApplication.class, args);
	}

}
