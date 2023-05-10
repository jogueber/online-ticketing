package com.redis.school.bookingapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.redis.school.bookingapplication.models.Movies;
import com.redis.school.bookingapplication.repositories.MovieRepository;

@SpringBootApplication
public class BookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingApplication.class, args);
    }

}

@Component
class DummyDataGenerator implements CommandLineRunner {

    @Autowired
    private MovieRepository repository;

    @Override public void run(String... args) throws Exception {
        var movie = new Movies();
        movie.setName("arielle");
        repository.save(movie);
        var movie2 = new Movies();
        movie2.setName("supermann");
        repository.save(movie2);
    }
}
