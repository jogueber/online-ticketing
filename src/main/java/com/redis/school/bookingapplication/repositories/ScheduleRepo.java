package com.redis.school.bookingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.school.bookingapplication.models.TimeSlot;

public interface ScheduleRepo extends JpaRepository<TimeSlot, Long> {
}
