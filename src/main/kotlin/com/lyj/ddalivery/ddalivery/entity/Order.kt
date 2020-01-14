package com.lyj.ddalivery.ddalivery.entity


import com.thinkinglogic.builder.annotation.Builder
import javax.persistence.*

/**
 * 주문
 */
@Entity
@Table(name = "order_table")

data class Order(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val orderId : Long,
        @Column var clientId : Long, // 주문자명
        @Column var productId : Long // 아이템명
)
