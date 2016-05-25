package com.selling.controllers;

import com.selling.models.Items;
import com.selling.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("items/")
public class MainController {

    @Autowired
    ItemsRepository itemsRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Items> list(){
        return itemsRepo.findAll();
    }

    @RequestMapping(value="/store", method = RequestMethod.POST)
    public Items create(@RequestBody Items item){
        itemsRepo.save(item);
        return item;
    }

    @RequestMapping(value="id/{id}", method = RequestMethod.GET)
    public Items getId(@PathVariable int id){
        return itemsRepo.findById(id);
    }


}
