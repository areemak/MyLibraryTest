package com.jiran.mylibrarytest

import android.util.Log
import retrofit2.Retrofit

class MainTest {
    fun printTest() {
        Log.d("MainTest", "printTest: Hello Test!!")

        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build()

//        val service: GitHubService = retrofit.create(GitHubService::class.java)
//        val repose = service.listRepos("octocat")
//        Log.d("MainTest", "printTest: ${repose}")
    }
}