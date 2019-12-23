package com.lyj.ddalivery.ddalivery.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


/***
 * 상품 엔티티
 */
@Entity
data class Product(
        @GeneratedValue @Id val productId : Long,
        @Column(length = 100, nullable = false) val name : String,
        @Column(nullable = false) val image : String,
        @Column(nullable = false) val price : Int,

        @Column val seller : String

)