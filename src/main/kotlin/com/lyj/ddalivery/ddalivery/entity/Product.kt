package com.lyj.ddalivery.ddalivery.entity

import com.thinkinglogic.builder.annotation.Builder
import javax.persistence.*


/***
 * 상품 엔티티
 */
@Entity
@Table(name = "product")
data class Product(
        @GeneratedValue @Id val productId : Long?,
        @Column(length = 100, nullable = false) val name : String,
        @Column(nullable = false) val image : String,
        @Column(nullable = false) val price : Int,
        @Column val recommendedRateCount : Int,
        @Column val recommendedUserCount: Int,
        @Column val seller : String
)