package com.proj.spring.springproj;

import java.util.Arrays;
import java.util.List;
//
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//restcontroller
@RestController
public class Controller {
@GetMapping("/Books")
public List<Book> giveBook(){
	return Arrays.asList(new Book(1,"enshas book","ensha"));
}
}
