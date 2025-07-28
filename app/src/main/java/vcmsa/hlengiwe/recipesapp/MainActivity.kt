package vcmsa.hlengiwe.recipesapp

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.CaseMap
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//code starts here
        val btnRecipeBook = findViewById<Button>(R.id.btnRecipeBook)
        val btnDtlViewScreen = findViewById<Button>(R.id.btnDtlViewScreen)
        val btnExitApp = findViewById<Button>(R.id.btnExitApp)
        val tvRecipeTitle = findViewById<TextView>(R.id.tvRecipeTitle)
        val tvCategory = findViewById<TextView>(R.id.tvCategory)
        val tvRating = findViewById<TextView>(R.id.tvRating)
        val tvIngredients = findViewById<TextView>(R.id.tvIngredients)

        btnRecipeBook.setOnClickListener {

            {
            }

            // Array of RecipeBook
            val RecipeTitle = arrayOf(
                "Cheese Cake",
                "Spring Rolls",
                "Apple",
                "Oxtail"
            )
            val Category = arrayOf(
                "Dessert",
                "Starter",
                "Snack",
                "Main Course"
            )
            val Ratings = arrayOf(
                "8",
                "5",
                "3",
                "10"
            )
            val Ingredients = arrayOf(
                "Cream Cheese, Condense Milk, Lemon Juice, Biscuit",
                "Rotti, Carrot, Pepper, Salt",
                "Apple",
                "Oxtail, Onions, Tomato, Salt, Oil, Water"
            )

        }
        btnDtlViewScreen.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        btnExitApp.setOnClickListener {
            finish() // Close the app
        }
    }
}



