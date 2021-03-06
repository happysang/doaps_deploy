package kgu.doaps.service;

import kgu.doaps.domain.item.Item;
import kgu.doaps.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) { itemRepository.save(item);}

    public List<Item> findItems() { return itemRepository.findAll(); }

    public Item findOne(Long itemId) { return itemRepository.findOne(itemId); }

    public List<Item> findMyItem(Long itemId) { return itemRepository.findMyItem(itemId); }

    public List<Item> findByOrigin(String origin) { return itemRepository.findByOrigin(origin); }


}
