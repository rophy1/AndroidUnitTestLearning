package com.example.myapplication;


import android.app.Application;
import android.os.Build;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

/**
 * When I configure compileSdk 33 in gradle.
 * It went wrong：Absent Code attribute in method that is not native or abstract in class file android/app/Application
 *
 * But if I toggle compileSdk 34, it works fine.
 *
 * The configuration is shown in this project.
 * By the way, the Android Studio version：Android Studio Giraffe | 2022.3.1
 * JDK：17
 * Window11
 */

@RunWith(AndroidJUnit4.class)
@Config(application = Application.class, sdk = Build.VERSION_CODES.TIRAMISU)
public class MainActivityTest {

    @Test
    public void test(){
        Assert.assertEquals(4, 2 + 2);
    }
}
