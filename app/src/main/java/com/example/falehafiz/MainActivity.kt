package com.example.falehafiz



import android.content.Context
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


fun loadPoems(context:Context): List<String> {
    return listOf<String>(context.getString(R.string.poem),context.getString(R.string.poem2),
        context.getString(R.string.poem3),context.getString(R.string.poem4),context.getString(R.string.poem5))
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var context=this
        val poems= loadPoems(context)
        setContentView(R.layout.activity_main)
        val poemButton: Button = findViewById(R.id.poemButton)
        val poemTextView: TextView = findViewById(R.id.poemTextView)
        poemTextView.movementMethod = ScrollingMovementMethod()
//        println()
        poemButton.setOnClickListener {
//            val toast = Toast.makeText(this, "poem button selected!", Toast.LENGTH_SHORT)
//            toast.show()
            poemTextView.scrollTo(0,0)
            poemTextView.text = poems.random()
//            println()

        }
        val aboutButton: Button = findViewById(R.id.aboutButton)
        aboutButton.setOnClickListener {
//            val toast = Toast.makeText(this, "about button selected!", Toast.LENGTH_SHORT)
//            toast.show()
            poemTextView.text = context.getString(R.string.aboutInf)
//            println()
        }


    }

}