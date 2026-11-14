package com.edgesoft.chirp.repository;

import com.edgesoft.chirp.entity.TimelineRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimelineRepository extends MongoRepository<TimelineRecord, String> {
}
