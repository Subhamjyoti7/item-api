package com.subham.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subham.model.Item;
import com.subham.service.ItemServices;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/items")
@Valid
@RequiredArgsConstructor
public class ItemController {
	
	@Autowired
	private ItemServices itemServices;
	
	@PostMapping
	public  ResponseEntity<Item> addItem(
			@Valid @RequestBody Item item){
		
		return new ResponseEntity<>(itemServices.addItem(item),HttpStatus.CREATED);
	}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<?> getItem(@PathVariable int id) throws Exception {
	        Item item = itemServices.getItemById(id);
	        if (item == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                    .body("Item not found");
	        }
	        return ResponseEntity.ok(item);
	    }

}
