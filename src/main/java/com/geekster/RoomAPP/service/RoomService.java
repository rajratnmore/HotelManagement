package com.geekster.RoomAPP.service;

import com.geekster.RoomAPP.model.Room;
import com.geekster.RoomAPP.repo.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    IRoomRepo iRoomRepo;

    public String addRoom(Room newRoom) {
        iRoomRepo.save(newRoom);
        return "New Room is added";
    }


    public List<Room> getRooms() {
        return (List<Room>) iRoomRepo.findAll();
    }
}
