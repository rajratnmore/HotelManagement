package com.geekster.RoomAPP.repo;

import com.geekster.RoomAPP.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<Room, Integer> {

}
