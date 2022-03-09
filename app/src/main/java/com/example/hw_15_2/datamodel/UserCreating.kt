package com.example.hw_15_2.datamodel

data class UserCreating(
val firstName: String,
val lastName: String,
val nationalCode: String,
val hobbies:List<Hobbies>
)

enum class Hobbies {
    Sport,
    Sky,
    Music,
    Sleep,
    Dance
}
