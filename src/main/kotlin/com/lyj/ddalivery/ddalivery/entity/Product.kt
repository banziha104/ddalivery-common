package com.lyj.ddalivery.ddalivery.entity

import com.thinkinglogic.builder.annotation.Builder
import javax.persistence.*


/***
 * 상품 엔티티
 */
@Entity
@Table(name = "product")
data class Product(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val productId: Long?,
        @Column(length = 100, nullable = false) val name: String,
        @Column(nullable = false) val image: String,
        @Column(nullable = false) val description: String,
        @Column(nullable = false) val price: Int,
        @Column val recommendedRateCount: Int,
        @Column val recommendedUserCount: Int,
        @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)  @JoinColumn(name = "seller_id") var seller: Seller,
        @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)  @JoinColumn(name = "category_id") var category: Category
)