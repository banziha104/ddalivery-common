package com.lyj.ddalivery.ddalivery.entity

import com.thinkinglogic.builder.annotation.Builder
import javax.persistence.*

/***
 * 제휴업체 엔티티
 */

@Entity
@Table(name = "contractor")
data class Contractor(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val contractorId : Long,
        @Column(nullable = false, length = 20) val contractName : String,
        @Column(length = 30) val address : String
)