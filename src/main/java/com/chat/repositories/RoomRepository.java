package com.chat.repositories;

import com.chat.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,String> {
    //get room using roomID
    Room findByRoomId(String roomId);
    
}
