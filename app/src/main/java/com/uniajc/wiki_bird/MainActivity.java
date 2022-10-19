package com.uniajc.wiki_bird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Ave> ave = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view){
        Intent intent  = new Intent(this, ExplorerActivity.class);
        try {startActivity(intent);} catch (Exception e){
            System.out.println("Error -> "+e);
        }
    }

    public void agregarAves () {
        try {
            Ave datos = new Ave("Condor", "Colombia", "Cathartidae", "player1.mp3", "Es un ave grande y negra, con plumas blancas alrededor del cuello y en partes de las alas. La cabeza carece de plumas y es de color rojo, pudiendo cambiar de tonalidad de acuerdo con el estado emocional del ave. A diferencia de la mayor parte de las aves de presa, el macho es mayor que la hembra.");
            getAve().add(datos);
            datos = new Ave("Momoto Serrano", "Colombia", "Momotidae", "Momoto.mp3", "Rs una especie de ave coraciforme perteneciente al género Momotus de la familia Momotidae. Es nativo de la región andina del noroeste y oeste de América del Sur");
            getAve().add(datos);
            datos = new Ave("Quetzal Dorado", "Colombia", "Colombia", "QuetzalDorado.mp3", "Quetzal elegante y sin cresta, con cola negra que muestra un parche blanco por debajo. Ave generalmente silenciosa y poco común que habita a alturas intermedias en los Andes colombianos. Su nombre significa ave de manto largo y cabeza dorada.");
            getAve().add(datos);
            datos = new Ave("Trogón Enmascarado", "Colombia", "Trogonidae", "Trogon.mp3", "Trogon personatus es una especie de ave de la familia Trogonidae. Se le conoce popularmente con el nombre de La Soledad.");
            getAve().add(datos);
            datos = new Ave("Gallito de las rocas", "Colombia", "Cotingidae", "Gallito.mp3", " Es nativo de la región andino - amazónica del noroeste y oeste de América del Sur. No se conocen subespecies. Su pariente más cercano es el gallito de las rocas guayanés (R. rupicola) y es notable por la increíble belleza de su plumaje");
            getAve().add(datos);
            datos = new Ave("Cacique Candela", "Colombia", "Icteridae", "Cacique.mp3", "El cacique candela, turpial de vientre rojo o chango ventrirrojo,  es una especie de ave paseriforme de la familia Icteridae endémica de Colombia. Es el único miembro del género Hypopyrrhus.");
            getAve().add(datos);
            datos = new Ave("Carpintero Cheje", "Mexíco", "Picidae", "Cheje.mp3", "Melanerpes aurifrons es una especie de ave piciforme, perteneciente a la familia Picidae, subfamilia Picinae, del género Melanerpes. Comúnmente conocido como pájaro carpintero cheje.");
            getAve().add(datos);
            datos = new Ave("Cernícalo Americano", "Mexíco", "Falconidae", "Cernícalo.mp3", "Es una especie de ave falconiforme de la familia Falconidae. La UICN considera a la especie como de preocupación menor. Es un ave muy utilizada en la cetrería.");
            getAve().add(datos);
            datos = new Ave("Tinamidae", "Brasil", "Tinamidae", "Tinamidae.mp3", "Son una clase de aves paleognatas de distribución fundamentalmente neotropical. A algunas especies se las conoce como martinetas");
            getAve().add(datos);
            datos = new Ave("Guacamayo jacinto", "Brasil", "Psittacidae", "jacinto.mp3", "Es una especie de ave psitaciforme de la familia Psittacidae. Habita en las selvas de buena parte de Brasil, Bolivia y el norte de Paraguay. Es la especie de guacamayo de mayor tamaño.");
            getAve().add(datos);
            datos = new Ave("Toco Toucan", "Brasil", "Ramphastidae", "Toucan.mp3", "Es una especie de ave piciforme de la familia Ramphastidae, siendo su representante de mayor tamaño y uno de los más conocidos. ");
            getAve().add(datos);
        } catch (Exception e) {
            System.out.println("No se puedo llenar la lista");
        }
        finally {
            System.out.println(getAve());
        }
    }

    /**
     * @return the Ave
     */
    public ArrayList<Ave> getAve() {
        return ave;
    }


}