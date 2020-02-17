package com.lyj.ddalivery.ddalivery.entity


import com.lyj.ddalivery.base.AuditModel
import com.thinkinglogic.builder.annotation.Builder
import javax.persistence.*

/**
 * 주문
 */

@Entity
@Table(name = "order_table")
data class Order(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val orderId : Long?,
        @Column(nullable = false)  val productId : Long, // 아이템명
        @Column(length = 100, nullable = false) val productName: String,
        @Column(nullable = false) val image: String,
        @Column(nullable = false) val description: String,
        @Column(nullable = false) val price: Int,
        @Column(nullable = false) val quantity : Int,
        @Column(nullable = false) val sellerName : String,
        @Column(nullable = false) val sellerAddress : String,
        @Column(nullable = false) val categoryName : String,
        @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY) @JoinColumn(name = "order_group_id") var orderGroup : OrderGroup? = null
)
