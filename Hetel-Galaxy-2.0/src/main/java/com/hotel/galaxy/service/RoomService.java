package com.hotel.galaxy.service;

import com.hotel.galaxy.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface RoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;

    List<String> getAllRomTypes();

    List<Room> getAllRooms();

    byte[] getRoomPhotoById(Long roomId) throws SQLException;

    void deleteRoom(Long roomId);
}
