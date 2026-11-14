package com.edgesoft.chirp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "timeline")
public class TimelineRecord {
    @Id
    String id;
    @Indexed
    UUID userId;
    long chirpId;
}
