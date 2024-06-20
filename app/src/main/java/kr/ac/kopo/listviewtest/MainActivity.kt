package kr.ac.kopo.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imgv:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list=findViewById<ListView>(R.id.list)
        imgv=findViewById<ImageView>(R.id.imgV)

        var items= arrayOf("피자","치킨","콜라","곱창","떡볶이")
        var imgRes= arrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5)

        var adapter =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)
        list.adapter=adapter

        list.setOnItemClickListener { parent, view, position, id ->
            imgv.setImageResource( imgRes[position])
            Toast.makeText(applicationContext,items[position]+"는(은)정말 맛있어요~",Toast.LENGTH_SHORT).show()
        }




    }
}