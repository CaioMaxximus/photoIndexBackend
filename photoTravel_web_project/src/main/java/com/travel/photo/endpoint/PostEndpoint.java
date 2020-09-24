package com.travel.photo.endpoint;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.photo.model.Post;


@RestController
@RequestMapping("post")
@ResponseBody
public class PostEndpoint {

	@GetMapping("")
	public Post getPost() {
		return new Post();
	}

	@GetMapping("/list")
	public List<Post> getPosts(){
		return new ArrayList<Post>();
	}
	
	@DeleteMapping("")
	public Post removePost(){
		return new Post();
	}
	
	@PutMapping("/report")
	public  void reportPost() {
		
	}
	
}
