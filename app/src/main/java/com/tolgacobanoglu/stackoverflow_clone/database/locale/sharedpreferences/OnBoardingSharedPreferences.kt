package com.tolgacobanoglu.stackoverflow_clone.database.locale.sharedpreferences

import android.content.Context
import androidx.fragment.app.FragmentActivity

class OnBoardingSharedPreferences
{
    companion object
    {
        /**
         * fragmentActivity equals to requireActivity():this method it returns FragmentActivity
         */
        @JvmStatic
        fun isDone(fragmentActivity:FragmentActivity): Boolean
        {
            var isDone = false

            val sharedPref = fragmentActivity.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
            isDone = sharedPref.getBoolean("Finished",false)

            return isDone
        }

        /**
         * fragmentActivity equals to requireActivity():this method it returns FragmentActivity
         */
        @JvmStatic
        fun done(fragmentActivity:FragmentActivity)
        {
            val sharedPref = fragmentActivity.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putBoolean("Finished",true)
            editor.apply()
        }


    }
}