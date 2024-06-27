package com.example.myprofile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myprofile.databinding.ActivityMainBinding
import com.example.myprofile.databinding.UserBlogBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvProfiles.layoutManager=LinearLayoutManager(this)
        displayProfiles()

    }

    fun displayProfiles(){
        val myProfile = Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","","See More")
        val myProfile2= Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","","See More")
        val myProfile3 = Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","","See More")
        val myProfile4 = Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","","See More")
        val myProfile5 = Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","","See More")
        val myProfile6 = Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","","See More")

        val myProfiles = listOf(myProfile,myProfile2,myProfile3,myProfile4,myProfile5,myProfile6)
        val profilesAdapter = ProfilesAdapter(myProfiles)
        binding.rvProfiles.adapter = profilesAdapter
    }
}