package com.edgesoft.chirp.controller;

import com.edgesoft.chirp.entity.TimelineRecord;
import com.edgesoft.chirp.service.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/timeline")
public class TimelineController {

    @Autowired
    private TimelineService timelineService;

    @GetMapping
    public ResponseEntity<List<TimelineRecord>> getTimeline(@RequestParam String userId){
        List<TimelineRecord> timeline = timelineService.getTimeline(userId);
        return ResponseEntity.ok(timeline);
    }

    @PostMapping
    public ResponseEntity<TimelineRecord> putOnTimeline(@RequestParam String userId, @RequestParam long chirpId){
        TimelineRecord record = timelineService.putOnTimeline(userId, chirpId);
        return ResponseEntity.ok(record);
    }
}
