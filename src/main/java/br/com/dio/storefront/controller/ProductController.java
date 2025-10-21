package br.com.dio.storefront.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("products")
@AllArgsConstructor
@Log4j2
public class ProductController {

		@GetMapping("test")
		void test() {
			
			System.out.println("test");
			
		}
		
		
}
