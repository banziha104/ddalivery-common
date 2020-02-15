package com.lyj.ddalivery.ddalivery.entity

import com.lyj.ddalivery.base.AuditModel
import javax.persistence.*

@Entity
@Table(name = "order_group")
data class OrderGroup(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val orderGroupId : Long?,
        @Column val clientName : String,
        @Column val address : String,
        @Column val latitude : Double,
        @Column val longitude : Double,
        @Column val totalPrice : Int,
        @OneToMany(mappedBy = "orderGroup") val orders : List<Order>? = null
) : AuditModel<Long>(){
    override fun getId(): Long? = orderGroupId
}