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
        val myProfile = Profile("Yvonne Martin","","Caucasian","09/5/2023", "The Caucasian Chalk Circle is a play that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","https://images.unsplash.com/photo-1555967522-37949fc21dcb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Ym9va3N8ZW58MHx8MHx8fDA%3D","See More")
        val myProfile2= Profile("John Kiriamiti","","My life in crime","09/5/2023", "The Caucasian Chalk Circle is a " +
            "play " +
            "that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","https://plus.unsplash.com/premium_photo-1669652639356-f5cb1a086976?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGJvb2tzfGVufDB8fDB8fHww","See More")
        val myProfile3 = Profile("David Allen","","The Pearl","09/5/2023", "The Caucasian Chalk Circle is a play that" +
            " tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","https://images.unsplash.com/photo-1622519624366-1b06e2f2aa0d?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fGJvb2tzfGVufDB8fDB8fHww","See More")
        val myProfile4 = Profile("Ole Kaelo","","Kigogo","09/5/2023", "The Caucasian Chalk Circle is a play that " +
            "tells" +
            " two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","https://images.unsplash.com/photo-1605819048853-e2ae489e1360?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGJvb2tzfGVufDB8fDB8fHww","See More")
        val myProfile5 = Profile("Joyfree Ngira","","Blossoms","09/5/2023", "The Caucasian Chalk Circle is a play " +
            "that " +
            "tells " +
            "two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","https://images.unsplash.com/photo-1632479734663-a742f1c4ef88?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fGJvb2tzfGVufDB8fDB8fHww","See More")
        val myProfile6 = Profile("Ngugi Wa Thiongo","","A grain of wheat","09/5/2023", "The Caucasian Chalk Circle is" +
            " a play" +
            " that tells two intertwined stories. The first follows Grusha, a kitchen maid who rescues and cares for the governor's abandoned son during a violent coup. The second story centers on Azdak, a corrupt but clever judge who is unexpectedly appointed to preside over a custody battle between Grusha and the governor's wife. In a climactic scene, Azdak orders the women to pull on the child's arms, with the one who lets go declared the true mother. Grusha's selfless refusal to harm the child convinces Azdak to award her custody, despite her lack of biological claim. ","https://plus.unsplash.com/premium_photo-1682685339195-5accc2261f70?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Njl8fGJvb2tzfGVufDB8fDB8fHww","See More")

        val myProfiles = listOf(myProfile,myProfile2,myProfile3,myProfile4,myProfile5,myProfile6)
        val profilesAdapter = ProfilesAdapter(myProfiles)
        binding.rvProfiles.adapter = profilesAdapter
    }
}