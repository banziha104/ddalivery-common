package com.lyj.ddalivery.ddalivery.entity

import com.lyj.ddalivery.base.AuditModel
import javax.persistence.*

@Entity
@Table(name = "order_group")
data class OrderGroup(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val orderGroupId: Long?,
        @Column(nullable = false) val clientId : Int,
        @Column(nullable = false) val clientName: String,
        @Column(nullable = false) val address: String,
        @Column(nullable = false) val latitude: Double,
        @Column(nullable = false) val longitude: Double,
        @Column(nullable = false) var isMatched: Boolean,
        @Column(nullable = false) var isCompleted: Boolean,
        @OneToMany(mappedBy = "orderGroup") val orders: List<Order>? = null
) : AuditModel<Long>() {
    override fun getId(): Long? = orderGroupId
}