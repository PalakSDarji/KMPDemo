package com.kmpdemo.shared.model

data class User(
    val id: String,
    val name: String,
    val email: String,
    val location: String,
    val bio: String,
    val avatarUrl: String? = null
)
