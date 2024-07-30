package com.hotel.galaxy.repository;

import com.hotel.galaxy.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
