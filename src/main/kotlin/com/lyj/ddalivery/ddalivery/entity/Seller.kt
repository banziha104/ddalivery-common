package com.lyj.ddalivery.ddalivery.entity

import javax.persistence.*

@Entity
@Table(name = "seller")
data class Seller(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val sellerId: Long?,
        @Column(length = 20, nullable = false) val name: String
//        @Column(nullable = false) val description: String,
//        @Column(nullable = false) val image: String
)