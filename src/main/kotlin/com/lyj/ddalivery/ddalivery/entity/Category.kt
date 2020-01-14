package com.lyj.ddalivery.ddalivery.entity

import javax.persistence.*


/**
 * 카테고리 엔티티
 */
@Entity
@Table(name = "category")
data class Category(
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id val categoryId : Long?,
        @Column val categoryName : String,
        @OneToMany(mappedBy = "category") val products : List<Product>? = null
)