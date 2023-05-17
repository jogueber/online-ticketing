package com.redis.school.bookingapplication.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @ManyToOne @JoinColumn(name = "user_user_id")
    private User user;

    @OneToMany
    private List<Reservation> reservationList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
