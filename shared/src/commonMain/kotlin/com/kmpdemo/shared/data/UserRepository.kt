package com.kmpdemo.shared.data

import com.kmpdemo.shared.model.User

class UserRepository {
    private val users = listOf(
        User(
            id = "1",
            name = "Ava Nguyen",
            email = "ava.nguyen@example.com",
            location = "San Francisco, CA",
            bio = "Product designer who loves clean interfaces and cats.",
            avatarUrl = null
        ),
        User(
            id = "2",
            name = "Liam Patel",
            email = "liam.patel@example.com",
            location = "Austin, TX",
            bio = "Android engineer, coffee fanatic, and trail runner.",
            avatarUrl = null
        ),
        User(
            id = "3",
            name = "Mia Thompson",
            email = "mia.thompson@example.com",
            location = "Seattle, WA",
            bio = "Full-stack developer exploring KMP and indie games.",
            avatarUrl = null
        ),
        User(
            id = "4",
            name = "Noah Garcia",
            email = "noah.garcia@example.com",
            location = "New York, NY",
            bio = "iOS engineer building delightful experiences.",
            avatarUrl = null
        ),
        User(
            id = "5",
            name = "Sophia Kim",
            email = "sophia.kim@example.com",
            location = "Chicago, IL",
            bio = "Data scientist who tinkers with mobile UI in spare time.",
            avatarUrl = null
        )
    )

    fun getUsers(): List<User> = users

    fun getUsersArray(): Array<User> = users.toTypedArray()

    fun getUser(id: String): User? = users.firstOrNull { it.id == id }
}
