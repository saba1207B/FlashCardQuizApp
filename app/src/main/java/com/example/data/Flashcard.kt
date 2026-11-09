// Copyright (c) 2026 Sabareesh M (saba1207B). All Rights Reserved.
// All rights reserved. No public license is granted.

package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flashcards")
data class Flashcard(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val question: String,
    val answer: String,
    val category: String = "General",
    val isMastered: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)
