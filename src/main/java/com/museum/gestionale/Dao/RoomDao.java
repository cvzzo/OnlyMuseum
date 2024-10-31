package com.museum.gestionale.Dao;

import com.museum.gestionale.Entity.Current;
import com.museum.gestionale.Entity.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomDao extends CrudRepository<Room, Integer> {
}
