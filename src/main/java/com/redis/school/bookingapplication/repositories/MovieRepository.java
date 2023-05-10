package com.redis.school.bookingapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.school.bookingapplication.models.Movies;

public interface MovieRepository extends JpaRepository<Movies, Long> {
}
