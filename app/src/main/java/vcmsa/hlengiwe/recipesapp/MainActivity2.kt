package vcmsa.hlengiwe.recipesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class btnAverage {

}

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// code starts here
        val btnRecipesList = findViewById<Button>(R.id.btnRecipesList)
        val btnAverage = findViewById<Button>(R.id.brnAverage)
        val btnReturnToMain = findViewById<Button>(R.id.btnReturnToMain)
        // get data from MainActivity
        val intent = intent
        val recipeTitle = intent.getStringExtra("recipeTitle")
        val category = intent.getStringExtra("category")
        val rating = intent.getStringExtra("rating")
        val ingredients = intent.getStringExtra("ingredients")


    }

    }





