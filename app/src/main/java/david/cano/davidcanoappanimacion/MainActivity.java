package david.cano.davidcanoappanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaramos una rotacion
        Animation rotacion;

        //asignamos la animacion que vamos a cargar
        rotacion= AnimationUtils.loadAnimation(this, R.anim.tween);

        //resetea la animacion
        rotacion.reset();

        //inicia la animacion rotacion de la imagen
        imagen.startAnimation(rotacion);
    }
}