package com.subham.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.subham.model.Item;


@Service
public class ItemServices {
	
	private List<Item> items= new ArrayList<>();
	
	public Item addItem(Item item) {
		items.add(item);
		
		return item;
	}
	
	
	public Item getItemById(int id) throws Exception {
		return items.stream()
				.filter(item -> item.getId()== id)
				.findFirst()
				.orElseThrow(
						()-> new Exception("Item not found by id"));
	}
	
	
	
	

}
