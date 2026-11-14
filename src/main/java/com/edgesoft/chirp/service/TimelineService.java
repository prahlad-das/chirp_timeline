package com.edgesoft.chirp.service;

import com.edgesoft.chirp.entity.TimelineRecord;
import com.edgesoft.chirp.repository.TimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TimelineService {
    @Autowired
    TimelineRepository timelineRepository;

    public List<TimelineRecord> getTimeline(String userId) {
        return timelineRepository.findAllByUserId(UUID.fromString(userId));
    }

    public TimelineRecord putOnTimeline(String userId, long chirpId) {
        TimelineRecord record = TimelineRecord.builder()
                .userId(UUID.fromString(userId))
                .chirpId(chirpId)
                .build();
        return timelineRepository.save(record);
    }
}
