package com.example.chatroomapp.data

import com.google.firebase.firestore.FirebaseFirestore
import kotlin.getValue

object Injection {
    private val instance: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }

    fun instance(): FirebaseFirestore {
        return instance
    }
}