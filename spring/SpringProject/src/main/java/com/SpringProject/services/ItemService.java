package com.SpringProject.services;

import com.SpringProject.entities.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.SpringProject.repositories.ItemRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public void add(Item item) {
        itemRepository.save(item);
    }

    public String delete(int id) {
        if (itemRepository.existsById(id)) {
            Item item = itemRepository.findById(id).get();
            itemRepository.delete(item);
            return "Deleted "+item.getId();
        }
        return "Item not found";
    }

    public String update(int id, Item item) {
        if (itemRepository.existsById(id)) {
            Item item1 = itemRepository.findById(id).get();
            item1.setId(item.getId());
            itemRepository.save(item);
            return "Updated "+item.getId();
        }
        return "Item not found";
    }
}
