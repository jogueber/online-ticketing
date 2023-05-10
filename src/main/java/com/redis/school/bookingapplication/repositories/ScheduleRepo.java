package com.redis.school.bookingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.school.bookingapplication.models.Schedule;

public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
}
