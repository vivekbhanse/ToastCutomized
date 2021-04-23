package com.ssurvase.createtoastcustome

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ssurvase.customtoast.customizedToast


class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x=findViewById<View>(R.id.red)
        val y=findViewById<View>(R.id.green)
        val z=findViewById<View>(R.id.elses)
        x.setOnClickListener(this)
        y.setOnClickListener(this)
        z.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val x=p0!!.id
        when(x){
            R.id.red -> {
                // Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
                customizedToast.showcustomToast("Hello", "red", this)
            }
            R.id.green -> {
                // Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
                customizedToast.showcustomToast("Hello", "green", this)
            }
            R.id.elses -> {
                // Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
                // customizedToast.showcustomToast("Hello","erro",this)
                // customizedToast.shapedToast("jkdfsgsag", R.drawable.shapea,this,R.drawable.ic_launcher_background)
                // customizedToast.showcustomToast(this,"hids",R.color.gorkhaColor,35)

                val tt =
                    Toast.makeText(this@MainActivity, "Your text displayed here", Toast.LENGTH_LONG)
                tt.setGravity(Gravity.CENTER, 0, 0)
                tt.show()
            }
        }
    }
}