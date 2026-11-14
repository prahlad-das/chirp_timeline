package com.edgesoft.chirp.controller;

import com.edgesoft.chirp.entity.TimelineRecord;
import com.edgesoft.chirp.service.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/timeline")
public class TimelineController {

    @Autowired
    private TimelineService timelineService;

    @GetMapping
    public ResponseEntity<List<TimelineRecord>> getTimeline(String userId){
        timelineService.getTimeline(userId);
    }

    @PostMapping
    public ResponseEntity<TimelineRecord> putOnTimeline(String userId, long chirpId){
        timelineService.putOnTimeline(userId, chirpId);
    }
}
