package com.ltapi.devhub.services

import com.ltapi.devhub.database.User
import com.ltapi.devhub.database.UserRequest
import kotlinx.coroutines.runBlocking
import java.lang.StringBuilder


class UserService {
    private val root = Config().root

    suspend fun loginUser(request: UserRequest): User? {
        return Utils().sendPostRequest(root + "user/login", request)
    }

    fun postSignupData(request: UserRequest) {
//        runBlocking {
//            Utils().sendPostRequest(root + "user/new", user)
//        }
    }
}