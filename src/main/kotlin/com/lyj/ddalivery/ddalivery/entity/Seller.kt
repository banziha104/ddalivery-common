package com.lyj.ddalivery.ddalivery.entity

import com.vividsolutions.jts.geom.Point
import javax.persistence.*


/***
 * 판매자
 */
@Entity
@Table(name = "seller")
data class Seller(
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        val sellerId: Long?,

        @Column(length = 20, nullable = false)
        val sellerName: String,

        @Column(nullable = false)
        val image: String,

        @Column(nullable = false)
        val latitude : Double,

        @Column(nullable = false)
        val longitude : Double,


        @OneToMany(mappedBy = "seller") var products : List<Product>? = null

//        @Column(nullable = false) val description: String,
)