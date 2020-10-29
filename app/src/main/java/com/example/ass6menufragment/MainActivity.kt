package com.example.ass6menufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(
                R.id.FrameLayout,FragmentOne()
            ).commit()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        when(item?.itemId){

            R.id.menu2 -> {
                transaction.replace(R.id.FrameLayout, FragmentTwo())
                transaction.addToBackStack(null)
                transaction.commit()
                return true}
            R.id.menu3 -> {
                transaction.replace(R.id.FrameLayout, FragmentThree())
                transaction.addToBackStack(null)
                transaction.commit()
                return true}
            else -> return super.onOptionsItemSelected(item)
        }
    }
}