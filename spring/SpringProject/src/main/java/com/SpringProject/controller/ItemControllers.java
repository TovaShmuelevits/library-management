package com.SpringProject.controller;


import com.SpringProject.entities.Item;
import com.SpringProject.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemControllers {
    private final ItemService itemService;

    @GetMapping("/getAll")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }

    @PostMapping("/add")
    public void addItem(@RequestBody Item item) {
        itemService.add(item);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id) {
        return itemService.delete(id);
    }

    @PutMapping("/updateById/{id}")
    public String updateById(@PathVariable int id, @RequestBody Item item) {
        return itemService.update(id,item);
    }

}

