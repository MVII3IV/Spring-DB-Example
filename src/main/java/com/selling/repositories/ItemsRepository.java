package com.selling.repositories;


import com.selling.models.Items;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemsRepository extends CrudRepository<Items,Long>{
    List<Items> findByName(String name);
    Items findById(int id);
}
