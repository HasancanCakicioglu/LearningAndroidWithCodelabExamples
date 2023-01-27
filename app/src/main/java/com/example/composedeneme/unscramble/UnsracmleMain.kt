package com.example.composedeneme.unscramble

import com.example.composedeneme.superHero.HeroesList



import android.content.ContentValues.TAG
import androidx.compose.material.MaterialTheme

import androidx.compose.material.*

import com.example.composedeneme.R


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


import androidx.compose.foundation.layout.*

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.stringResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedeneme.superHero.model.HeroesRepository

import com.example.composedeneme.ui.theme.ComposedenemeTheme
import com.example.composedeneme.unscramble.ui.GameScreen


class MainActivity7 : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedenemeTheme {

                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        GameScreen()
                    }

            }
        }
    }
}

