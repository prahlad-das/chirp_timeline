package com.edgesoft.chirp.repository;

import com.edgesoft.chirp.entity.TimelineRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface TimelineRepository extends MongoRepository<TimelineRecord, String> {
    List<TimelineRecord> findAllByUserId(UUID userId);
}
