package gasolinaoualcool.curso.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolia;
    private Button verificar;
    private TextView melhorCombustivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.preco_alcool_id);
        precoGasolia = (EditText) findViewById(R.id.preco_gasolina_id);
        verificar = (Button) findViewById(R.id.botao_verificar_id);
        melhorCombustivel = (TextView) findViewById(R.id.texto_id);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoAlcool = precoAlcool.getText().toString();
                String textoGasolina = precoGasolia.getText().toString();

                Double valorAlcool = Double.parseDouble(textoAlcool);
                Double valorGasolina = Double.parseDouble(textoGasolina);

                Double resultado = valorAlcool/valorGasolina;
                if (resultado > 0.7){
                    melhorCombustivel.setText("É melhor abastecer com gasolina");
                }else {
                    melhorCombustivel.setText("É melhor abastecer com alcool");
                }

            }
        });
    }
}
